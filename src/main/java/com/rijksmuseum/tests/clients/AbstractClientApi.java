package com.rijksmuseum.tests.clients;

import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.aeonbits.owner.ConfigFactory;
import com.rijksmuseum.tests.utils.Environment;

@Getter(AccessLevel.PROTECTED)
@Setter(AccessLevel.PROTECTED)
public abstract class AbstractClientApi {
    Environment testEnvironment = ConfigFactory.create(Environment.class);

    protected RequestSpecification getRequestSpecification(String basePath) {
        return new RequestSpecBuilder()
                .setBaseUri(testEnvironment.uri())
                .setBasePath(basePath)
                .addParam("key", testEnvironment.getKey())
                .addFilter(new AllureRestAssured())
                .build();
    }
}
