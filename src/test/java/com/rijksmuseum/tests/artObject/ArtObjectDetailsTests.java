package com.rijksmuseum.tests.artObject;

import com.rijksmuseum.tests.AbstractTest;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;
import com.rijksmuseum.tests.model.artObject.ArtObject;

import static com.rijksmuseum.tests.steps.artObject.details.DetailsSteps.assertArtObjectsDetails;
import static com.rijksmuseum.tests.Behaviors.ART_OBJECT_DETAILS;
import static com.rijksmuseum.tests.testData.consts.Formats.JSONP;
import static com.rijksmuseum.tests.testData.consts.Formats.XML;

@Epic(ART_OBJECT_DETAILS)
@Feature("Get an Art Object details")
public class ArtObjectDetailsTests extends AbstractTest {

    @Test(description = "TC_01 Verifying an Art Object details page")
    public void checkArtObjectNl() {
        ArtObject actualResult = steps.details.getArtObjectDetails(data.details.getDefaultArtObject());
        assertArtObjectsDetails(actualResult, data.details.getDefaultArtObject());
    }

    @Test(description = "TC_02 Verifying an Art Object details page in XML format")
    public void checkArtObjectNlXml() {
        ArtObject actualResult = steps.details.getArtObjectDetails(data.details.getDefaultArtObject(), XML);
        assertArtObjectsDetails(actualResult, data.details.getDefaultArtObject());
    }

    @Test(description = "TC_03 Verifying an Art Object details page in Jsonp format")
    public void checkArtObjectNlJsonp() {
        ArtObject actualResult = steps.details.getArtObjectDetails(data.details.getDefaultArtObject(), JSONP);
        assertArtObjectsDetails(actualResult, data.details.getDefaultArtObject());
    }

    @Test(description = "TC_04 Verifying that the 404 status code returns for the request with a wrong object number")
    public void checkStatusCodeForWrongObjectNumber() {
        steps.details.checkNotFoundStatusCode(data.details.getArtObjectWithWrongObjectNumber());
    }

    //TODO: Here could be test cases to verify other specific Art Objects.
}
