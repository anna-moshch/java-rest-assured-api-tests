package com.rijksmuseum.tests.artObject.details;

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
@Test
public class ArtObjectDetailsTests extends AbstractTest {

    @Test(description = "TC_01 Verifying an Art Object details page for nl language")
    public void checkArtObjectNl() {
        ArtObject actualResult = steps.details.getArtObjectDetails(data.details.getDefaultArtObjectNl());
        assertArtObjectsDetails(actualResult, data.details.getDefaultArtObjectNl());
    }

    @Test(description = "TC_02 Verifying an Art Object details page for en language")
    public void checkArtObjectEn() {
        ArtObject actualResult = steps.details.getArtObjectDetails(data.details.getDefaultArtObjectEn());
        assertArtObjectsDetails(actualResult, data.details.getDefaultArtObjectEn());
    }

    @Test(description = "TC_03 Verifying an Art Object details page for nl language in XML format")
    public void checkArtObjectNlXml() {
        ArtObject actualResult = steps.details.getArtObjectDetails(data.details.getDefaultArtObjectNl(), XML);
        assertArtObjectsDetails(actualResult, data.details.getDefaultArtObjectNl());
    }

    @Test(description = "TC_04 Verifying an Art Object details page for en language in XML format")
    public void checkArtObjectEnXml() {
        ArtObject actualResult = steps.details.getArtObjectDetails(data.details.getDefaultArtObjectEn(), XML);
        assertArtObjectsDetails(actualResult, data.details.getDefaultArtObjectEn());
    }

    @Test(description = "TC_05 Verifying an Art Object details page for el language in Jsonp format")
    public void checkArtObjectNlJsonp() {
        ArtObject actualResult = steps.details.getArtObjectDetails(data.details.getDefaultArtObjectNl(), JSONP);
        assertArtObjectsDetails(actualResult, data.details.getDefaultArtObjectNl());
    }

    @Test(description = "TC_06 Verifying an Art Object details page for el language in Jsonp format")
    public void checkArtObjectEnJsonp() {
        ArtObject actualResult = steps.details.getArtObjectDetails(data.details.getDefaultArtObjectEn(), JSONP);
        assertArtObjectsDetails(actualResult, data.details.getDefaultArtObjectEn());
    }

    @Test(description = "TC_07 Verifying that the 404 status code returns for the request with a wrong object number")
    public void checkStatusCodeForWrongObjectNumber() {
        steps.details.checkNotFoundStatusCode(data.details.getArtObjectWithWrongObjectNumber());
    }

    @Test(description = "TC_08 Verifying that the 404 status code returns for the request with a wrong culture code")
    public void checkStatusCodeForWrongLanguage() {
        steps.details.checkNotFoundStatusCode(data.details.getArtObjectWithWrongLanguage());
    }

    //TODO: Here could be test cases to verify other specific Art Objects.
}
