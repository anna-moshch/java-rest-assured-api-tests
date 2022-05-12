package com.rijksmuseum.tests.artObject.search;

import com.rijksmuseum.tests.AbstractTest;
import com.rijksmuseum.tests.testData.consts.Culture;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;
import com.rijksmuseum.tests.model.artObject.ArtObjectsItem;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static com.rijksmuseum.tests.Behaviors.ART_OBJECT_SEARCH;


@Epic(ART_OBJECT_SEARCH)
@Feature("Get search results with paging")
@Test
public class SearchPagingTests extends AbstractTest {

    @Test(description = "TC_01 Verifying that 100 items in Search results are returned")
    public void verifyMaximumPageParam() {
        List<ArtObjectsItem> actualResult = steps.search.getArtObjectItems(Culture.NL, data.params.getParamPagingMax());
        assertThat(actualResult.size()).isEqualTo(100);
    }

    @Test(description = "TC_02 Verifying that the less than 101 item are returned with ps param wore than 100")
    public void verifyingPsParamMoreThanAllowed() {
        List<ArtObjectsItem> actualResult = steps.search.getArtObjectItems(Culture.EN, data.params.getParamPsMoreThanAllowed());
        assertThat(actualResult.size()).isLessThan(101);
    }

    @Test(description = "TC_03 Verifying that no results are returned for more than allowed paging")
    public void verifyPageParamMoreThanAllowed() {
        List<ArtObjectsItem> actualResult = steps.search.getArtObjectItems(Culture.NL, data.params.getParamPagingMoreThanAllowed());
        assertThat(actualResult.size()).isEqualTo(0);
    }

    @Test(description = "TC_04 Verifying that the first page is returned for incorrect page number")
    public void verifyIncorrectPageNumber() {
        List<ArtObjectsItem> actualResult = steps.search.getArtObjectItems(Culture.EN, data.params.getParamIncorrectPageNumber());
        assertThat(actualResult).contains(data.item.getFirstArtObjectItem());
    }
}
