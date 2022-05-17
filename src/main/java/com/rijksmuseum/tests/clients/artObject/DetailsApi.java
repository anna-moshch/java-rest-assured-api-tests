package com.rijksmuseum.tests.clients.artObject;

import com.rijksmuseum.tests.model.artObject.ArtObject;
import com.rijksmuseum.tests.clients.AbstractClientApi;
import com.rijksmuseum.tests.model.responces.GetDetailsResponse;
import com.rijksmuseum.tests.utils.TestConfig;

import static io.restassured.RestAssured.given;

public class DetailsApi extends AbstractClientApi {

    private String getBaseUrl(ArtObject artObject) {
        return "/api/" + TestConfig.LOCALIZATION + "/collection/" + artObject.getObjectNumber();
    }

    public ArtObject getArtObjectDetails(ArtObject artObject) {
        return given()
                .spec(getRequestSpecification(getBaseUrl(artObject)))
                .when().get().then()
                .statusCode(200)
                .extract()
                .response()
                .as(GetDetailsResponse.class)
                .getArtObject();
    }

    public ArtObject getArtObjectDetails(ArtObject artObject, String format) {
        return given()
                .spec(getRequestSpecification(getBaseUrl(artObject)).param("format", format))
                .when().get().then()
                .statusCode(200)
                .extract().response().as(GetDetailsResponse.class).getArtObject();
    }

    public void checkNotFoundStatusCode(ArtObject artObject) {
        given()
                .spec(getRequestSpecification(getBaseUrl(artObject)))
                .when().get().then()
                .statusCode(404);
    }
}
