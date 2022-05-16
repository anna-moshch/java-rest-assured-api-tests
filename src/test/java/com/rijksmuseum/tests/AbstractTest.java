package com.rijksmuseum.tests;

import com.google.common.collect.ImmutableMap;
import com.rijksmuseum.tests.steps.ServiceSteps;
import com.rijksmuseum.tests.testData.TestData;
import com.rijksmuseum.tests.utils.TestConfig;
import com.rijksmuseum.tests.utils.config.ConfigHolder;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import static com.github.automatedowl.tools.AllureEnvironmentWriter.allureEnvironmentWriter;

public abstract class AbstractTest {
    protected ServiceSteps steps;
    protected TestData data;

    @BeforeClass
    public void init() {
        steps = ConfigHolder.getInstance().getTestSteps();
        data = ConfigHolder.getInstance().getTestData();
    }

    @BeforeSuite
    public void beforeSuit() {
        allureEnvironmentWriter(
                ImmutableMap.<String, String>builder()
                        .put("URI", TestConfig.environment.uri())
                        .put("Culture", TestConfig.LOCALIZATION)
                        .build(), System.getProperty("user.dir")
                        + "/target/allure-results/");
    }
}
