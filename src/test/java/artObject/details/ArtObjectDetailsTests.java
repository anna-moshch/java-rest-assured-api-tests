package artObject.details;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;
import rijksmuseum.artObject.model.ArtObject;
import rijksmuseum.artObject.steps.details.DetailsSteps;
import rijksmuseum.artObject.testData.details.DetailsTestData;

import static rijksmuseum.artObject.steps.details.DetailsSteps.assertArtObjectsDetails;
import static rijksmuseum.artObject.Behaviors.ART_OBJECT_DETAILS;
import static rijksmuseum.artObject.testData.Formats.JSONP;
import static rijksmuseum.artObject.testData.Formats.XML;
import static rijksmuseum.artObject.testData.details.DetailsTestData.*;

@Epic(ART_OBJECT_DETAILS)
@Feature("Get an Art Object details")
@Test
public class ArtObjectDetailsTests {

    @Test(description = "TC_01 Verifying an Art Object details page for nl language")
    public void checkArtObjectNl() {
        ArtObject actualResult = DetailsSteps.getArtObjectDetails(getDefaultArtObjectNl());
        assertArtObjectsDetails(actualResult, DetailsTestData.getDefaultArtObjectNl());
    }

    @Test(description = "TC_02 Verifying an Art Object details page for en language")
    public void checkArtObjectEn() {
        ArtObject actualResult = DetailsSteps.getArtObjectDetails(getDefaultArtObjectEn());
        assertArtObjectsDetails(actualResult, DetailsTestData.getDefaultArtObjectEn());
    }

    @Test(description = "TC_03 Verifying an Art Object details page for nl language in XML format")
    public void checkArtObjectNlXml() {
        ArtObject actualResult = DetailsSteps.getArtObjectDetails(getDefaultArtObjectNl(), XML);
        assertArtObjectsDetails(actualResult, DetailsTestData.getDefaultArtObjectNl());
    }

    @Test(description = "TC_04 Verifying an Art Object details page for en language in XML format")
    public void checkArtObjectEnXml() {
        ArtObject actualResult = DetailsSteps.getArtObjectDetails(getDefaultArtObjectEn(), XML);
        assertArtObjectsDetails(actualResult, DetailsTestData.getDefaultArtObjectEn());
    }

    @Test(description = "TC_05 Verifying an Art Object details page for el language in Jsonp format")
    public void checkArtObjectNlJsonp() {
        ArtObject actualResult = DetailsSteps.getArtObjectDetails(getDefaultArtObjectNl(), JSONP);
        assertArtObjectsDetails(actualResult, DetailsTestData.getDefaultArtObjectNl());
    }

    @Test(description = "TC_06 Verifying an Art Object details page for el language in Jsonp format")
    public void checkArtObjectEnJsonp() {
        ArtObject actualResult = DetailsSteps.getArtObjectDetails(getDefaultArtObjectEn(), JSONP);
        assertArtObjectsDetails(actualResult, DetailsTestData.getDefaultArtObjectEn());
    }

    @Test(description = "TC_07 Verifying that the 404 status code returns for the request with a wrong object number")
    public void checkStatusCodeForWrongObjectNumber() {
        DetailsSteps.checkNotFoundStatusCode(DetailsTestData.getArtObjectWithWrongObjectNumber());
    }

    @Test(description = "TC_08 Verifying that the 404 status code returns for the request with a wrong culture code")
    public void checkStatusCodeForWrongLanguage() {
        DetailsSteps.checkNotFoundStatusCode(DetailsTestData.getArtObjectWithWrongLanguage());
    }

    //TODO: Here could be test cases to verify other specific Art Objects.
}
