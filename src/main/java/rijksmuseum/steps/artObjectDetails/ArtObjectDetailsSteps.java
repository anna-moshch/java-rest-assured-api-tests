package rijksmuseum.steps.artObjectDetails;

import io.qameta.allure.Step;
import io.qameta.allure.restassured.AllureRestAssured;
import org.assertj.core.api.SoftAssertions;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import rijksmuseum.model.objectMetaData.ArtObject;
import rijksmuseum.model.objectMetaData.responces.ArtObjectGetResponse;
import rijksmuseum.utils.TestConfig;

import static io.restassured.RestAssured.given;

public class ArtObjectDetailsSteps {


    private static RequestSpecification getRegSpecification(ArtObject artObject) {
        return new RequestSpecBuilder()
                .setBaseUri(TestConfig.BASE_URI)
                .setBasePath("/api/" + artObject.getLanguage() + "/collection/" + artObject.getObjectNumber())
                .addParams(TestConfig.KEY_PARAMS)
                .addFilter(new AllureRestAssured())
                .build();
    }

    @Step("Get an Art Object details")
    public static ArtObject getArtObjectDetails(ArtObject artObject) {
        return given()
                .spec(getRegSpecification(artObject))
                .when()
                .get()
                .then()
                .statusCode(200)
                .extract().response().as(ArtObjectGetResponse.class).getArtObject();
    }

    @Step("Get an Art Object details")
    public static ArtObject getArtObjectDetails(ArtObject artObject, String format) {
        return given()
                .spec(getRegSpecification(artObject).param("format", format))
                .when()
                .get()
                .then()
                .statusCode(200)
                .extract().response().as(ArtObjectGetResponse.class).getArtObject();
    }

    @Step("Verifying that 404 Not Found Status code returns")
    public static void checkNotFoundStatusCode(ArtObject artObject) {
        given()
                .spec(getRegSpecification(artObject))
                .when()
                .get()
                .then()
                .statusCode(404);
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
