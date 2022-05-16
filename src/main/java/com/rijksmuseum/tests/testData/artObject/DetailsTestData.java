package com.rijksmuseum.tests.testData.artObject;

import com.rijksmuseum.tests.model.artObject.ArtObject;

public interface DetailsTestData {

    ArtObject getDefaultArtObject();

    ArtObject getArtObjectWithWrongObjectNumber();

    ArtObject getArtObjectWithWrongLanguage();

}
