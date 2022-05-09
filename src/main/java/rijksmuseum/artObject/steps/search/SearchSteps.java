package rijksmuseum.artObject.steps.search;

import io.qameta.allure.Step;
import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import rijksmuseum.artObject.model.ArtObjectsItem;
import rijksmuseum.utils.TestConfig;

import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class SearchSteps {

    private static RequestSpecification getRegSpecification(String culture) {
        return new RequestSpecBuilder()
                .setBaseUri(TestConfig.BASE_URI)
                .setBasePath("/api/" + culture + "/collection/")
                .addParams(TestConfig.KEY_PARAMS)
                .addFilter(new AllureRestAssured())
                .build();
    }

    @Step("Get an Art Objects items list as a search result")
    public static List<ArtObjectsItem> getArtObjectItems(String culture, Map<String, String> params) {
        return given()
                .spec(getRegSpecification(culture))
                .params(params)
                .when()
                .get()
                .then()
                .statusCode(200)
                .extract().jsonPath().getList("artObjects", ArtObjectsItem.class);
    }

}
