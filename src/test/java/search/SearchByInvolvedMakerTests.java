package search;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;
import rijksmuseum.model.objectMetaData.ArtObjectsItem;
import rijksmuseum.steps.search.SearchSteps;
import rijksmuseum.testData.Culture;
import rijksmuseum.testData.search.SearchParamTestsData;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static rijksmuseum.testData.Behaviors.SEARCH;
import static rijksmuseum.testData.search.ArtObjectItemTestData.getArtObjectItemForSearchResults;

@Epic(SEARCH)
@Feature("Get Search results by involved maker")
@Test
public class SearchByInvolvedMakerTests {

    @Test(description = "TC_04 Verifying that the first page is returned for incorrect page number")
    public void verifyIncorrectPageNumber() {
        List<ArtObjectsItem> artObjects = SearchSteps.getArtObjectItems(Culture.EN, SearchParamTestsData.getParamInvolvedMarker());
        assertThat(artObjects).contains(getArtObjectItemForSearchResults());
    }
}
