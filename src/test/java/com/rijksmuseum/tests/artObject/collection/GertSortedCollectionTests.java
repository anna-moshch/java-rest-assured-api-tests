package com.rijksmuseum.tests.artObject.collection;

import com.rijksmuseum.tests.AbstractTest;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

import java.util.Collections;

import static com.rijksmuseum.tests.Behaviors.ART_OBJECT_COLLECTION;

@Epic(ART_OBJECT_COLLECTION)
@Feature("Get sorted collections")
public class GertSortedCollectionTests extends AbstractTest {

    @Test(description = "TC#01 Verifying that the collection is sorted by relevance")
    public void verifySortingByRelevance() {
        step.search.getArtObjectItems(Collections.singletonMap("s",
                "relevance"));

        //ToDO add assertions
    }

    @Test(description = "TC#02 Verifying that the collection is sorted by object type")
    public void verifySortingByObjectType() {
        step.search.getArtObjectItems(Collections.singletonMap("s",
                "objecttype"));
        //ToDO add assertions
    }

    @Test(description = "TC#03 Verifying that the collection is sorted by chronologic")
    public void verifySortingByChronologic() {
        step.search.getArtObjectItems(Collections.singletonMap("s",
                "chronologic"));
        //ToDO add assertions
    }

    @Test(description = "TC#03 Verifying that the collection is sorted by achronologic")
    public void verifySortingByAchronologic() {
        step.search.getArtObjectItems(Collections.singletonMap("s",
                "achronologic"));
        //ToDO add assertions
    }

    @Test(description = "TC#03 Verifying that the collection is sorted by artist")
    public void verifySortingByArtist() {
        step.search.getArtObjectItems(Collections.singletonMap("s",
                "artist"));
        //ToDO add assertions
    }

    @Test(description = "TC#03 Verifying that the collection is sorted by artistdesc")
    public void verifySortingByArtistdesc() {
        step.search.getArtObjectItems(Collections.singletonMap("s",
                "artistdesc"));
        //ToDO add assertions
    }
}
