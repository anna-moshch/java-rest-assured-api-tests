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
import static rijksmuseum.testData.search.ArtObjectItemTestData.getFirstArtObjectItem;
import static rijksmuseum.testData.search.SearchParamTestsData.getPsParamMoreThanAllowed;


@Epic(SEARCH)
@Feature("Get Search results with paging")
@Test
public class SearchPagingTests {

    @Test(description = "TC_01 Verifying that 100 items in Search results are returned")
    public void verifyMaximumPageParam () {
        List<ArtObjectsItem> artObjects = SearchSteps.getArtObjectItems(Culture.NL, SearchParamTestsData.getPageParamMax());
        assertThat(artObjects.size()).isEqualTo(100);
    }

    @Test(description = "TC_02 Verifying that the less than 101 item are returned with ps param wore than 100")
    public void verifyingPsParamMoreThanAllowed() {
        List<ArtObjectsItem> artObjects = SearchSteps.getArtObjectItems(Culture.EN, getPsParamMoreThanAllowed());
        assertThat(artObjects.size()).isLessThan(101);
    }

    @Test(description = "TC_03 Verifying that no results are returned for more than allowed paging")
    public void verifyPageParamMoreThanAllowed() {
        List<ArtObjectsItem> artObjects = SearchSteps.getArtObjectItems(Culture.NL, SearchParamTestsData.getPageParamMoreThanAllowed());
        assertThat(artObjects.size()).isEqualTo(0);
    }

    @Test(description = "TC_04 Verifying that the first page is returned for incorrect page number")
    public void verifyIncorrectPageNumber() {
        List<ArtObjectsItem> artObjects = SearchSteps.getArtObjectItems(Culture.EN, SearchParamTestsData.getIncorrectPageNumber());
        assertThat(artObjects).contains(getFirstArtObjectItem());
    }
}
