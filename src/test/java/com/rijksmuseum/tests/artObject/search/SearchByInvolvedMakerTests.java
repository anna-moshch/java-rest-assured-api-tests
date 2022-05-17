package com.rijksmuseum.tests.artObject.search;

import com.rijksmuseum.tests.AbstractTest;
import com.rijksmuseum.tests.model.artObject.ArtObjectsItem;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

import java.util.Collections;
import java.util.List;

import static com.rijksmuseum.tests.Behaviors.ART_OBJECT_SEARCH;

@Epic(ART_OBJECT_SEARCH)
@Feature("Get search results by involved maker")
public class SearchByInvolvedMakerTests extends AbstractTest {

    @Test(description = "TC#01 Verifying that the Art Object is displayed in the Search result by involved marker param")
    public void verifySearchByInvolvedMarket() {
        List<ArtObjectsItem> actualResult = step.search.getArtObjectItems(Collections.singletonMap("involvedMaker",
                data.item.getArtObjectItemForSearchResults().getPrincipalOrFirstMaker()));

        step.search.assertThatObjectIsPresentInCollection(actualResult,
                data.item.getArtObjectItemForSearchResults());
    }

    //TODO: here should be all tests to verify involved markers
}
