package artObject.images;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;
import rijksmuseum.artObject.model.LevelsItem;
import rijksmuseum.artObject.steps.images.ImagesSteps;
import rijksmuseum.artObject.testData.details.DetailsTestData;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static rijksmuseum.artObject.Behaviors.ART_OBJECT_IMAGES;

@Epic(ART_OBJECT_IMAGES)
@Feature("Get an Art Object images")
@Test
public class ArtObjectImagesTests {

    @Test(description = "TC_01 Verifying that the images list is not empty")
    public void checkArtObjectImagesListNotEmpty() {
        List<LevelsItem> actualResult = ImagesSteps.getArtObjectImages(DetailsTestData.getDefaultArtObjectNl());
        assertThat(actualResult.size()).isGreaterThan(0);
    }

    //TODO: add tests to verify tiles, for example for incorrect Art Object numbers should be 404, not 500
}
