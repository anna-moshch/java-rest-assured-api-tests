package artObjectDetails;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;
import rijksmuseum.model.objectMetaData.ArtObject;
import rijksmuseum.steps.artObjectDetails.ArtObjectDetailsSteps;

import static rijksmuseum.steps.artObjectDetails.ArtObjectDetailsSteps.assertArtObjectsDetails;
import static rijksmuseum.testData.Behaviors.ART_OBJECT_DETAILS;
import static rijksmuseum.testData.Formats.JSONP;
import static rijksmuseum.testData.Formats.XML;
import static rijksmuseum.testData.artObjectDetails.ArtObjectDetailsTestData.*;

@Epic(ART_OBJECT_DETAILS)
@Feature("Get Art Object Details")
@Test
public class artObjectDetailsTests {

    @Test(description = "TC_01 Verifying an Art Object details page for nl language")
    public void checkArtObjectNl() {
        ArtObject actualResult = ArtObjectDetailsSteps.getArtObjectDetails(getDefaultArtObjectNl());
        assertArtObjectsDetails(actualResult, getDefaultArtObjectNl());
    }

    @Test(description = "TC_02 Verifying an Art Object details page for en language")
    public void checkArtObjectEn() {
        ArtObject actualResult = ArtObjectDetailsSteps.getArtObjectDetails(getDefaultArtObjectEn());
        assertArtObjectsDetails(actualResult, getDefaultArtObjectEn());
    }

    @Test(description = "TC_03 Verifying an Art Object details page for nl language in XML format")
    public void checkArtObjectNlXml() {
        ArtObject actualResult = ArtObjectDetailsSteps.getArtObjectDetails(getDefaultArtObjectNl(), XML);
        assertArtObjectsDetails(actualResult, getDefaultArtObjectNl());
    }

    @Test(description = "TC_04 Verifying an Art Object details page for en language in XML format")
    public void checkArtObjectEnXml() {
        ArtObject actualResult = ArtObjectDetailsSteps.getArtObjectDetails(getDefaultArtObjectEn(), XML);
        assertArtObjectsDetails(actualResult, getDefaultArtObjectEn());
    }

    @Test(description = "TC_05 Verifying an Art Object details page for el language in Jsonp format")
    public void checkArtObjectNlJsonp() {
        ArtObject actualResult = ArtObjectDetailsSteps.getArtObjectDetails(getDefaultArtObjectNl(), JSONP);
        assertArtObjectsDetails(actualResult, getDefaultArtObjectNl());
    }

    @Test(description = "TC_06 Verifying an Art Object details page for el language in Jsonp format")
    public void checkArtObjectEnJsonp() {
        ArtObject actualResult = ArtObjectDetailsSteps.getArtObjectDetails(getDefaultArtObjectEn(), JSONP);
        assertArtObjectsDetails(actualResult, getDefaultArtObjectEn());
    }

    @Test(description = "TC_07 Verifying that the 404 status code returns for the request with a wrong object number")
    public void checkStatusCodeForWrongObjectNumber() {
        ArtObjectDetailsSteps.checkNotFoundStatusCode(getArtObjectWithWrongObjectNumber());
    }

    @Test(description = "TC_08 Verifying that the 404 status code returns for the request with a wrong culture code")
    public void checkStatusCodeForWrongLanguage() {
        ArtObjectDetailsSteps.checkNotFoundStatusCode(getArtObjectWithWrongLanguage());
    }

    //TODO: Here could be test cases to verify other specific art objects.
}
