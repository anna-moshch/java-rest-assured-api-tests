package com.rijksmuseum.tests.utils.config;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.rijksmuseum.tests.testData.TestData;
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
        Injector injector = Guice.createInjector();
        TestData testData = injector.getInstance(TestData.class);
        log.info("testData: {}", testData);
        return testData;
    }

}
