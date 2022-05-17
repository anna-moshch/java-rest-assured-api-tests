package com.rijksmuseum.tests.steps.artObject.images;

import com.google.inject.Inject;
import com.rijksmuseum.tests.clients.artObject.ImagesApi;
import com.rijksmuseum.tests.model.artObject.ArtObject;
import com.rijksmuseum.tests.model.artObject.LevelsItem;
import io.qameta.allure.Step;
import lombok.Data;

import java.util.List;

@Data
public class ImagesSteps {

    @Inject
    private ImagesApi images;

    @Step("Get an Art Object images")
    public List<LevelsItem> getArtObjectImages(ArtObject artObject) {
        return images.getArtObjectImages(artObject);
    }

    @Step("Verifying that 404 Not Found Status code returns")
    public void checkNotFoundStatusCode(ArtObject artObject) {
        images.checkNotFoundStatusCode(artObject);
    }
}
