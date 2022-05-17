package com.rijksmuseum.tests.steps.artObject.collection;

import com.google.inject.Inject;
import com.rijksmuseum.tests.clients.artObject.CollectionApi;
import io.qameta.allure.Step;
import com.rijksmuseum.tests.model.artObject.ArtObjectsItem;
import lombok.Data;

import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

@Data
public class CollectionSteps {
    @Inject
    private CollectionApi search;

    @Step("Get an Art Objects items collection with params")
    public List<ArtObjectsItem> getArtObjectItems(Map<String, String> params) {
        return search.getItemsCollection(params);
    }


    @Step("Assert that the Art Objects item is present in the result collection")
    public void assertThatObjectIsPresentInCollection(List<ArtObjectsItem> actualResult, ArtObjectsItem expectedResult) {
        assertThat(actualResult)
                .contains(expectedResult);
    }



}
