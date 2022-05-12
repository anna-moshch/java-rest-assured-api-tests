package com.rijksmuseum.tests.artObject.search;

import com.rijksmuseum.tests.AbstractTest;
import com.rijksmuseum.tests.testData.consts.Culture;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

import java.util.Collections;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static com.rijksmuseum.tests.Behaviors.ART_OBJECT_SEARCH;

@Epic(ART_OBJECT_SEARCH)
@Feature("Get search results by involved maker")
@Test
public class SearchByInvolvedMakerTests extends AbstractTest {

    @Test(description = "TC_01 Verifying that the Art Object is displayed in the Search result by involved marker param")
    public void verifySearchByInvolvedMarket() {
        Map<String, String> params = Collections.singletonMap("involvedMaker",
                data.item.getArtObjectItemForSearchResults().getPrincipalOrFirstMaker());

        assertThat(steps.search.getArtObjectItems(Culture.EN, params))
                .contains(data.item.getArtObjectItemForSearchResults());
    }

    //TODO: here should be all tests to verify involved markers
}
