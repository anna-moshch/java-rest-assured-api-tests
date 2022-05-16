package com.rijksmuseum.tests.utils.config;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.rijksmuseum.tests.testData.TestData;
import com.rijksmuseum.tests.utils.TestConfig;
import com.rijksmuseum.tests.utils.config.bindTestData.bindTestDataEn;
import com.rijksmuseum.tests.utils.config.bindTestData.bindTestDataNl;
import lombok.extern.slf4j.Slf4j;
import com.rijksmuseum.tests.steps.ServiceSteps;

@Slf4j
class ConfigLoader {

    static ServiceSteps loadTestSteps() {
        Injector injector = Guice.createInjector();
        ServiceSteps steps = injector.getInstance(ServiceSteps.class);
        log.info("steps: {}", steps);
        return steps;
    }

    static TestData loadTestData() {
        Injector injector;
        TestData data;
        switch (TestConfig.environment.localization()) {
            case "nl":
                injector = Guice.createInjector(new bindTestDataNl());
                data = injector.getInstance(TestData.class);
                break;
            case "en":
                injector = Guice.createInjector(new bindTestDataEn());
                data = injector.getInstance(TestData.class);
                break;
            default:
                throw new IllegalArgumentException(
                        String.format("There is no test data implementation for: '%s'", TestConfig.environment.localization()));
        }
        return data;
    }

}
