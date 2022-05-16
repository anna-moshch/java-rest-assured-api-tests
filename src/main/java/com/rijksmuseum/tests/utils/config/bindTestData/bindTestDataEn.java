package com.rijksmuseum.tests.utils.config.bindTestData;

import com.google.inject.AbstractModule;
import com.rijksmuseum.tests.testData.artObject.DetailsTestData;
import com.rijksmuseum.tests.testData.artObject.ItemTestData;
import com.rijksmuseum.tests.testData.artObject.en.DetailsTestDataEn;
import com.rijksmuseum.tests.testData.artObject.en.ItemTestDataEn;

public class bindTestDataEn extends AbstractModule {
    @Override
    public void configure() {
        bind(DetailsTestData.class).to(DetailsTestDataEn.class);
        bind(ItemTestData.class).to(ItemTestDataEn.class);
    }
}