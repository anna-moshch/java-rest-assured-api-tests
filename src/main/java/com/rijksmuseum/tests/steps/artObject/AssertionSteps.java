package com.rijksmuseum.tests.steps.artObject;

import io.qameta.allure.Step;

import static org.assertj.core.api.Assertions.assertThat;

public class AssertionSteps {

    @Step("Assert that the collection size is {expectedResult}")
    public void assertEqualSize(int actualResult, int expectedResult) {
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Step("Assert that the collection size is bigger than {expectedResult}")
    public void assertGreaterSize(int actualResult, int expectedResult) {
        assertThat(actualResult).isGreaterThan(expectedResult);
    }

}
