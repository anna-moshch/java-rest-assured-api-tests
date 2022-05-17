package com.rijksmuseum.tests.artObject.search;

import com.rijksmuseum.tests.AbstractTest;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;
import com.rijksmuseum.tests.model.artObject.ArtObjectsItem;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static com.rijksmuseum.tests.Behaviors.ART_OBJECT_SEARCH;


@Epic(ART_OBJECT_SEARCH)
@Feature("Get search results with paging")
public class SearchPagingTests extends AbstractTest {

    @Test(description = "TC#01 Verifying that maximum 100 items in Search results are returned")
    public void verifyMaximumPageParam() {
        List<ArtObjectsItem> actualResult = step.search.getArtObjectItems(data.params.getParamPagingMax());
        step.generic.assertEqualSize(actualResult.size(), 100);
    }

    @Test(description = "TC#02 Verifying that the 100 item are returned with ps param wore than 100")
    public void verifyingPsParamMoreThanAllowed() {
        List<ArtObjectsItem> actualResult = step.search.getArtObjectItems(data.params.getParamPsMoreThanAllowed());
        step.generic.assertEqualSize(actualResult.size(), 100);
    }

    @Test(description = "TC#03 Verifying that no results are returned for more than allowed paging")
    public void verifyPageParamMoreThanAllowed() {
        List<ArtObjectsItem> actualResult = step.search.getArtObjectItems(data.params.getParamPagingMoreThanAllowed());
        step.generic.assertEqualSize(actualResult.size(), 0);
    }

    @Test(description = "TC#04 Verifying that the results are returned for incorrect page number")
    public void verifyIncorrectPageNumber() {
        List<ArtObjectsItem> actualResult = step.search.getArtObjectItems(data.params.getParamIncorrectPageNumber());
        step.generic.assertGreaterSize(actualResult.size(), 0);
    }
}
