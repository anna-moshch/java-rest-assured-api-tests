package com.rijksmuseum.tests.testData;

import com.google.inject.Inject;
import com.rijksmuseum.tests.testData.artObject.DetailsTestData;
import com.rijksmuseum.tests.testData.artObject.ItemTestData;
import com.rijksmuseum.tests.testData.artObject.ParamsTestsData;

public class TestData {
    @Inject
    public DetailsTestData details;

    @Inject
    public ItemTestData item;

    @Inject
    public ParamsTestsData params;
}
