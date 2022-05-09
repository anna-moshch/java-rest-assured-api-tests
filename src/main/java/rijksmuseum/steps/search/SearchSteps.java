package rijksmuseum.steps.search;

import io.qameta.allure.Step;
import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import rijksmuseum.model.objectMetaData.ArtObjectsItem;
import rijksmuseum.utils.TestConfig;

import java.util.HashMap;
import java.util.List;

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

    @Step("Get Art Objects Items list as Search result")
    public static List<ArtObjectsItem> getArtObjectItems(String culture, HashMap<String, String> params){
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
