package com.rijksmuseum.tests.artObject;

import com.rijksmuseum.tests.AbstractTest;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;
import com.rijksmuseum.tests.model.artObject.LevelsItem;

import java.util.List;

import static com.rijksmuseum.tests.Behaviors.ART_OBJECT_IMAGES;

@Epic(ART_OBJECT_IMAGES)
@Feature("Get Art Object images")
public class GetImagesTests extends AbstractTest {

    @Test(description = "TC#01 Verifying that the images list is not empty")
    public void checkArtObjectImagesListNotEmpty() {
        List<LevelsItem> actualResult = step.images.getArtObjectImages(data.details.getDefaultArtObject());
        step.generic.assertGreaterSize(actualResult.size(), 0);
    }

    @Test(description = "TC#02 Verifying that 404 error is returned for incorrect object number")
    public void check404ErrorFroIncorrectObjectNumber() {
        step.images.checkNotFoundStatusCode(data.details.getArtObjectWithWrongObjectNumber());
    }
}
