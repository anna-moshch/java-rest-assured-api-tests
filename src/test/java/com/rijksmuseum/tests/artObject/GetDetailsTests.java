package com.rijksmuseum.tests.artObject;

import com.rijksmuseum.tests.AbstractTest;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;
import com.rijksmuseum.tests.model.artObject.ArtObject;

import static com.rijksmuseum.tests.Behaviors.ART_OBJECT_DETAILS;
import static com.rijksmuseum.tests.testData.consts.Formats.JSONP;
import static com.rijksmuseum.tests.testData.consts.Formats.XML;

@Epic(ART_OBJECT_DETAILS)
@Feature("Get Art Object details")
public class GetDetailsTests extends AbstractTest {

    @Test(description = "TC#01 Verifying an Art Object details page")
    public void checkArtObject() {
        ArtObject actualResult = step.details.getArtObjectDetails(data.details.getDefaultArtObject());
        step.details.assertArtObjectsDetails(actualResult, data.details.getDefaultArtObject());
    }

    @Test(description = "TC#02 Verifying an Art Object details page in XML format")
    public void checkArtObjectXml() {
        ArtObject actualResult = step.details.getArtObjectDetails(data.details.getDefaultArtObject(), XML);
        step.details.assertArtObjectsDetails(actualResult, data.details.getDefaultArtObject());
    }

    @Test(description = "TC#03 Verifying an Art Object details page in Jsonp format")
    public void checkArtObjectJsonp() {
        ArtObject actualResult = step.details.getArtObjectDetails(data.details.getDefaultArtObject(), JSONP);
        step.details.assertArtObjectsDetails(actualResult, data.details.getDefaultArtObject());
    }

    @Test(description = "TC#04 Verifying 404 status code for incorrect format")
    public void checkStatusCodeForWrongFormat() {
        step.details.checkNotFoundStatusCode(data.details.getDefaultArtObject(), "jsons");
    }

    @Test(description = "TC#05 Verifying that the 404 status code for the request with a wrong object number")
    public void checkStatusCodeForWrongObjectNumber() {
        step.details.checkNotFoundStatusCode(data.details.getArtObjectWithWrongObjectNumber());
    }

    //TODO: Here could be test cases to verify other specific Art Objects.
}
