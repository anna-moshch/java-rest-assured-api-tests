package com.rijksmuseum.tests.clients.artObject;

import com.rijksmuseum.tests.model.artObject.ArtObject;
import com.rijksmuseum.tests.clients.AbstractClientApi;
import com.rijksmuseum.tests.model.responces.DetailsGetResponse;

import static io.restassured.RestAssured.given;

public class DetailsApi extends AbstractClientApi {

    private String getBaseUrl(ArtObject artObject){
        return "/api/" + artObject.getLanguage() + "/collection/" + artObject.getObjectNumber();
    }

    public ArtObject getArtObjectDetails(ArtObject artObject) {
        return given()
                .spec(getRequestSpecification(getBaseUrl(artObject)))
                .when().get().then()

                .statusCode(200)
                .log().all()


                .extract()
                .response()
                .as(DetailsGetResponse.class)
                .getArtObject();
    }

    public ArtObject getArtObjectDetails(ArtObject artObject, String format) {
        return given()
                .spec(getRequestSpecification(getBaseUrl(artObject)).param("format", format))
                .when().get().then()
                .statusCode(200)
                .extract().response().as(DetailsGetResponse.class).getArtObject();
    }

    public void checkNotFoundStatusCode(ArtObject artObject) {
        given()
                .spec(getRequestSpecification(getBaseUrl(artObject)))
                .when().get().then()
                .statusCode(404);
    }
}
