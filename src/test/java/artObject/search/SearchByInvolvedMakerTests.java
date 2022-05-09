package artObject.search;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;
import rijksmuseum.artObject.steps.search.SearchSteps;
import rijksmuseum.artObject.testData.Culture;
import rijksmuseum.artObject.testData.search.ItemTestData;

import java.util.Collections;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static rijksmuseum.artObject.Behaviors.ART_OBJECT_SEARCH;

@Epic(ART_OBJECT_SEARCH)
@Feature("Get search results by involved maker")
@Test
public class SearchByInvolvedMakerTests {

    @Test(description = "TC_01 Verifying that the Art Object is displayed in the Search result by involved marker param")
    public void verifySearchByInvolvedMarket() {
        Map<String, String> params = Collections.singletonMap("involvedMaker",
                ItemTestData.getArtObjectItemForSearchResults().getPrincipalOrFirstMaker());

        assertThat(SearchSteps.getArtObjectItems(Culture.EN, params))
                .contains(ItemTestData.getArtObjectItemForSearchResults());
    }

    //TODO: here should be all tests to verify involved markers
}
