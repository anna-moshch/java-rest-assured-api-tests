package com.rijksmuseum.tests.clients.artObject;

import com.rijksmuseum.tests.clients.AbstractClientApi;
import com.rijksmuseum.tests.model.artObject.ArtObjectsItem;
import com.rijksmuseum.tests.utils.TestConfig;

import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class SearchApi extends AbstractClientApi {

    private String getBaseUrl() {
        return "/api/" + TestConfig.LOCALIZATION  + "/collection/";
    }

    public List<ArtObjectsItem> getArtObjectItems(Map<String, String> params) {
        return given()
                .spec(getRequestSpecification(getBaseUrl()))
                .params(params)
                .when()
                .get()
                .then()
                .statusCode(200)
                .extract().jsonPath().getList("artObjects", ArtObjectsItem.class);
    }
}
