package com.rijksmuseum.tests.artObject.collection;

import com.rijksmuseum.tests.AbstractTest;
import com.rijksmuseum.tests.model.artObject.ArtObjectsItem;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

import java.util.Collections;
import java.util.List;

import static com.rijksmuseum.tests.Behaviors.ART_OBJECT_COLLECTION;

@Epic(ART_OBJECT_COLLECTION)
@Feature("Get filtered collections")
public class GetFilteredCollectionTests extends AbstractTest {

    @Test(description = "TC#01 Verifying that the Art Object is displayed in the Search result by involved marker param")
    public void verifyFilterByInvolvedMarket() {
        List<ArtObjectsItem> actualResult = step.search.getArtObjectItems(Collections.singletonMap("involvedMaker",
                data.item.getDefaultArtObjectItem().getPrincipalOrFirstMaker()));

        step.search.assertThatObjectIsPresentInCollection(actualResult,
                data.item.getDefaultArtObjectItem());
    }

    @Test(description = "TC#02 Verifying that the Art Object is displayed in the Search result by type")
    public void verifyFilterType() {
        List<ArtObjectsItem> actualResult = step.search.getArtObjectItems(Collections.singletonMap("type",
                data.details.getDefaultArtObject().getObjectTypes().get(0)));

        step.search.assertThatObjectIsPresentInCollection(actualResult,
                data.item.getDefaultArtObjectItem());
    }

    @Test(description = "TC#03 Verifying that the Art Object is displayed in the Search result by f.dating.period")
    public void verifyFilterByDatingPeriod() {
        List<ArtObjectsItem> actualResult = step.search.getArtObjectItems(Collections.singletonMap("f.dating.period",
                "17"));
        step.search.assertThatObjectIsPresentInCollection(actualResult,
                data.item.getDefaultArtObjectItem());
    }

    @Test(description = "TC#04 Verifying that the Art Object is displayed in the Search result by material")
    public void verifyFilterByMaterial() {
        List<ArtObjectsItem> actualResult = step.search.getArtObjectItems(Collections.singletonMap("material",
                data.details.getDefaultArtObject().getMaterials().get(0)));
        step.search.assertThatObjectIsPresentInCollection(actualResult,
                data.item.getDefaultArtObjectItem());
    }

    @Test(description = "TC#05 Verifying that the Art Object is displayed in the Search result by f.normalized32Colors.hex")
    public void verifyFilterByColor() {
        List<ArtObjectsItem> actualResult = step.search.getArtObjectItems(Collections.singletonMap("f.normalized32Colors.hex",
                "#000000"));
        step.search.assertThatObjectIsPresentInCollection(actualResult,
                data.item.getDefaultArtObjectItem());
    }

    @Test(description = "TC#05 Verifying that the Art Object is displayed in the Search result by imgonly=true")
    public void verifyFilterByImgonlyTrue() {
         step.search.getArtObjectItems(Collections.singletonMap("imgonly", "true"));
        //TODO: add assertions
    }



    @Test(description = "TC#06 Verifying that the Art Object is displayed in the Search result by toppieces=true")
    public void verifyFilterByToppiecesTrue() {
        step.search.getArtObjectItems(Collections.singletonMap("toppieces", "true"));
        //TODO: add assertions

    }

    @Test(description = "TC#07 Verifying that the Art Object is displayed in the Search result by technique")
    public void verifyFilterByTechnique() {
        step.search.getArtObjectItems(Collections.singletonMap("technique", ""));
    }

}
