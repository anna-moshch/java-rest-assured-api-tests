package com.rijksmuseum.tests.clients.artObject;

import com.rijksmuseum.tests.clients.AbstractClientApi;
import com.rijksmuseum.tests.model.artObject.ArtObjectsItem;

import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class SearchApi extends AbstractClientApi {

    private String getBaseUrl(String culture) {
        return "/api/" + culture + "/collection/";
    }

    public List<ArtObjectsItem> getArtObjectItems(String culture, Map<String, String> params) {
        return given()
                .spec(getRequestSpecification(getBaseUrl(culture)))
                .params(params)
                .when()
                .get()
                .then()
                .statusCode(200)
                .extract().jsonPath().getList("artObjects", ArtObjectsItem.class);
    }
}
