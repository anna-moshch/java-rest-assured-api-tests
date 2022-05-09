package artObject.search;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;
import rijksmuseum.artObject.model.ArtObjectsItem;
import rijksmuseum.artObject.steps.search.SearchSteps;
import rijksmuseum.artObject.testData.Culture;
import rijksmuseum.artObject.testData.search.ItemTestData;
import rijksmuseum.artObject.testData.search.ParamsTestsData;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static rijksmuseum.artObject.Behaviors.ART_OBJECT_SEARCH;


@Epic(ART_OBJECT_SEARCH)
@Feature("Get search results with paging")
@Test
public class SearchPagingTests {

    @Test(description = "TC_01 Verifying that 100 items in Search results are returned")
    public void verifyMaximumPageParam() {
        List<ArtObjectsItem> actualResult = SearchSteps.getArtObjectItems(Culture.NL, ParamsTestsData.getParamPagingMax());
        assertThat(actualResult.size()).isEqualTo(100);
    }

    @Test(description = "TC_02 Verifying that the less than 101 item are returned with ps param wore than 100")
    public void verifyingPsParamMoreThanAllowed() {
        List<ArtObjectsItem> actualResult = SearchSteps.getArtObjectItems(Culture.EN, ParamsTestsData.getParamPsMoreThanAllowed());
        assertThat(actualResult.size()).isLessThan(101);
    }

    @Test(description = "TC_03 Verifying that no results are returned for more than allowed paging")
    public void verifyPageParamMoreThanAllowed() {
        List<ArtObjectsItem> actualResult = SearchSteps.getArtObjectItems(Culture.NL, ParamsTestsData.getParamPagingMoreThanAllowed());
        assertThat(actualResult.size()).isEqualTo(0);
    }

    @Test(description = "TC_04 Verifying that the first page is returned for incorrect page number")
    public void verifyIncorrectPageNumber() {
        List<ArtObjectsItem> actualResult = SearchSteps.getArtObjectItems(Culture.EN, ParamsTestsData.getParamIncorrectPageNumber());
        assertThat(actualResult).contains(ItemTestData.getFirstArtObjectItem());
    }
}
