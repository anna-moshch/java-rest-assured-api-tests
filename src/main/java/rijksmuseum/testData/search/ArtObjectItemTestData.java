package rijksmuseum.testData.search;

import rijksmuseum.model.objectMetaData.ArtObjectsItem;
import rijksmuseum.model.objectMetaData.HeaderImage;
import rijksmuseum.model.objectMetaData.Links;
import rijksmuseum.model.objectMetaData.WebImage;

import java.util.Collections;

public class ArtObjectItemTestData {

    public static ArtObjectsItem getFirstArtObjectItem() {
        return ArtObjectsItem.builder()
                .id("en-BK-NM-1010")
                .objectNumber("BK-NM-1010")
                .title("Dolls’ house of Petronella Oortman")
                .hasImage(true)
                .principalOrFirstMaker("anonymous")
                .longTitle("Dolls’ house of Petronella Oortman, anonymous, c. 1686 - c. 1710")
                .showImage(true)
                .permitDownload(true)
                .webImage(WebImage.builder()
                        .guid("8c3131da-1405-426f-9b23-5671a93920af")
                        .height(2266)
                        .width(2500)
                        .offsetPercentageX(0)
                        .offsetPercentageY(0)
                        .url("https://lh3.ggpht.com/OIaBDlLOhgpAQHGdfYfIh0ygXRqgBNR-tW7se4OTwOtD6dsr6xLAmp8u_pfsqJ-0EqB_wbCF_0mvCl979lWxfFIyFQQ=s0")
                        .build())
                .headerImage(HeaderImage.builder()
                        .guid("fde471c0-800c-4bea-b28e-a8523a1b643f")
                        .offsetPercentageX(0)
                        .offsetPercentageY(0)
                        .width(1920)
                        .height(460)
                        .url("https://lh3.ggpht.com/QARSFMHdk59lhi0GnyZzxvqkt3rMLpYrBI8dXqEVjnbLgcb4PudxSzYaLxju5Juo4CzwwSC2wlq2ZDUMXw54tIhgmF0=s0")
                        .build())
                .productionPlaces(Collections.singletonList("Amsterdam"))
                .links(Links.builder()
                        .self("http://www.rijksmuseum.nl/api/en/collection/BK-NM-1010")
                        .web("http://www.rijksmuseum.nl/en/collection/BK-NM-1010")
                        .build())
                .build();
    }
}
