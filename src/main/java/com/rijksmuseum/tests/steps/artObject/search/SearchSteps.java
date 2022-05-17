package com.rijksmuseum.tests.steps.artObject.search;

import com.google.inject.Inject;
import com.rijksmuseum.tests.clients.artObject.SearchApi;
import io.qameta.allure.Step;
import com.rijksmuseum.tests.model.artObject.ArtObjectsItem;
import lombok.Data;

import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

@Data
public class SearchSteps {
    @Inject
    private SearchApi search;

    @Step("Get an Art Objects items list as a search result")
    public List<ArtObjectsItem> getArtObjectItems(Map<String, String> params) {
        return search.getArtObjectItems(params);
    }


    @Step("Assert that the Art Objects item is present in the result collection")
    public void assertThatObjectIsPresentInCollection(List<ArtObjectsItem> actualResult, ArtObjectsItem expectedResult) {
        assertThat(actualResult)
                .contains(expectedResult);
    }



}
