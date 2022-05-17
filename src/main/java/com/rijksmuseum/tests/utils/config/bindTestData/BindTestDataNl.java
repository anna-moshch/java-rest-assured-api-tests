package com.rijksmuseum.tests.utils.config.bindTestData;

import com.google.inject.AbstractModule;
import com.rijksmuseum.tests.testData.artObject.DetailsTestData;
import com.rijksmuseum.tests.testData.artObject.ItemTestData;
import com.rijksmuseum.tests.testData.artObject.nl.DetailsTestDataNl;
import com.rijksmuseum.tests.testData.artObject.nl.ItemTestDataNl;

public class BindTestDataNl extends AbstractModule {
    @Override
    public void configure() {
        bind(DetailsTestData.class).to(DetailsTestDataNl.class);
        bind(ItemTestData.class).to(ItemTestDataNl.class);
    }
}
