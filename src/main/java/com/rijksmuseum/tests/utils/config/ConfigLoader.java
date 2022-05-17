package com.rijksmuseum.tests.utils.config;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.rijksmuseum.tests.testData.TestData;
import com.rijksmuseum.tests.utils.TestConfig;
import com.rijksmuseum.tests.utils.config.bindTestData.BindTestDataEn;
import com.rijksmuseum.tests.utils.config.bindTestData.BindTestDataNl;
import lombok.extern.slf4j.Slf4j;
import com.rijksmuseum.tests.steps.ServiceSteps;

@Slf4j
class ConfigLoader {

    ServiceSteps loadTestSteps() {
        Injector injector = Guice.createInjector();
        ServiceSteps steps = injector.getInstance(ServiceSteps.class);
        log.info("steps: {}", steps);
        return steps;
    }

    TestData loadTestData() {
        Injector injector;
        TestData data;
        switch (TestConfig.environment.localization()) {
            case "nl":
                injector = Guice.createInjector(new BindTestDataNl());
                data = injector.getInstance(TestData.class);
                break;
            case "en":
                injector = Guice.createInjector(new BindTestDataEn());
                data = injector.getInstance(TestData.class);
                break;
            default:
                throw new IllegalArgumentException(
                        String.format("There is no test data implementation for: '%s'", TestConfig.environment.localization()));
        }
        return data;
    }

}
