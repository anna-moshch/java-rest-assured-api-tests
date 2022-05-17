package com.rijksmuseum.tests.clients.artObject;

import com.rijksmuseum.tests.clients.AbstractClientApi;
import com.rijksmuseum.tests.model.artObject.ArtObject;
import com.rijksmuseum.tests.model.artObject.LevelsItem;
import com.rijksmuseum.tests.utils.TestConfig;

import java.util.List;

import static io.restassured.RestAssured.given;

public class ImagesApi extends AbstractClientApi {

    private String getBaseUrl(ArtObject artObject) {
        return "/api/" + TestConfig.LOCALIZATION + "/collection/" + artObject.getObjectNumber() + "/tiles";
    }

    public List<LevelsItem> getArtObjectImages(ArtObject artObject) {
        return given()
                .spec(getRequestSpecification(getBaseUrl(artObject)))
                .when().get().then()
                .statusCode(200)
                .extract().jsonPath().getList("levels", LevelsItem.class);
    }

    public void checkNotFoundStatusCode(ArtObject artObject) {
        given()
                .spec(getRequestSpecification(getBaseUrl(artObject)))
                .when().get().then()
                .statusCode(404);
    }
}
