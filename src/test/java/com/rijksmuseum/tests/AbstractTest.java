package com.rijksmuseum.tests;

import com.rijksmuseum.tests.steps.ServiceSteps;
import com.rijksmuseum.tests.testData.TestData;
import com.rijksmuseum.tests.utils.config.ConfigHolder;
import org.testng.annotations.BeforeClass;

public abstract class AbstractTest {
    protected ServiceSteps steps;
    protected TestData data;

    @BeforeClass
    public void beforeTest(){
        steps = ConfigHolder.getInstance().getTestSteps();
        data = ConfigHolder.getInstance().getTestData();
    }
}
