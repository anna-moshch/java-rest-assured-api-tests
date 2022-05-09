package rijksmuseum.artObject.steps.images;

import io.qameta.allure.Step;
import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import rijksmuseum.artObject.model.ArtObject;
import rijksmuseum.artObject.model.LevelsItem;
import rijksmuseum.artObject.testData.Culture;
import rijksmuseum.utils.TestConfig;

import java.util.List;

import static io.restassured.RestAssured.given;

public class ImagesSteps {

    private static RequestSpecification getRegSpecification(ArtObject artObject) {
        return new RequestSpecBuilder()
                .setBaseUri(TestConfig.BASE_URI)
                .setBasePath("/api/" + Culture.NL + "/collection/" + artObject.getObjectNumber() + "/tiles")
                .addParams(TestConfig.KEY_PARAMS)
                .addFilter(new AllureRestAssured())
                .build();
    }

    @Step("Get an Art Object images")
    public static List<LevelsItem> getArtObjectImages(ArtObject artObject) {
        return given()
                .spec(getRegSpecification(artObject))
                .when()
                .get()
                .then()
                .statusCode(200)
                .extract().jsonPath().getList("levels", LevelsItem.class);
    }
}
