package com.rijksmuseum.tests.steps.artObject.details;

import com.google.inject.Inject;
import com.rijksmuseum.tests.clients.artObject.DetailsApi;
import com.rijksmuseum.tests.model.artObject.ArtObject;
import io.qameta.allure.Step;
import lombok.Data;
import org.assertj.core.api.SoftAssertions;

@Data
public class DetailsSteps {

    @Inject
    private DetailsApi details;

    @Step("Get an Art Object details")
    public ArtObject getArtObjectDetails(ArtObject artObject) {
        return details.getArtObjectDetails(artObject);
    }

    @Step("Get an Art Object details")
    public ArtObject getArtObjectDetails(ArtObject artObject, String format) {
        return details.getArtObjectDetails(artObject, format);
    }

    @Step("Verifying that 404 Not Found Status code returns")
    public void checkNotFoundStatusCode(ArtObject artObject) {
        details.checkNotFoundStatusCode(artObject);
    }

    @Step("Assert the Art Object")
    public static void assertArtObjectsDetails(ArtObject actualResult, ArtObject expectedResult) {
        SoftAssertions softly = new SoftAssertions();
        softly.assertThat(actualResult.getId()).isEqualTo(expectedResult.getId());
        softly.assertThat(actualResult.getObjectNumber()).isEqualTo(expectedResult.getObjectNumber());
        softly.assertThat(actualResult.getTitle()).isEqualTo(expectedResult.getTitle());
        softly.assertThat(actualResult.getLanguage()).isEqualTo(expectedResult.getLanguage());
        softly.assertThat(actualResult.getTitles()).isEqualTo(expectedResult.getTitles());
        softly.assertThat(actualResult.getDescription()).isEqualTo(expectedResult.getDescription());
        softly.assertThat(actualResult.getPrincipalMaker()).isEqualTo(expectedResult.getPrincipalMaker());

        //TODO: here could be added all necessary asserts
        softly.assertAll();
    }
}
