package rijksmuseum.artObject.testData.search;

import rijksmuseum.artObject.model.ArtObjectsItem;
import rijksmuseum.artObject.model.HeaderImage;
import rijksmuseum.artObject.model.Links;
import rijksmuseum.artObject.model.WebImage;

import java.util.Collections;

public class ItemTestData {

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
                        .offsetPercentageX(0)
                        .offsetPercentageY(0)
                        .width(2500)
                        .height(2266)
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

    public static ArtObjectsItem getArtObjectItemForSearchResults() {
        return ArtObjectsItem.builder()
                .id("en-SK-C-5")
                .objectNumber("SK-C-5")
                .title("The Night Watch")
                .hasImage(true)
                .principalOrFirstMaker("Rembrandt van Rijn")
                .longTitle("The Night Watch, Rembrandt van Rijn, 1642")
                .showImage(true)
                .permitDownload(true)
                .webImage(WebImage.builder()
                        .guid("bbd1fae8-4023-4859-8ed1-d38616aec96c")
                        .offsetPercentageX(0)
                        .offsetPercentageY(1)
                        .width(5656)
                        .height(4704)
                        .url("https://lh3.googleusercontent.com/SsEIJWka3_cYRXXSE8VD3XNOgtOxoZhqW1uB6UFj78eg8gq3G4jAqL4Z_5KwA12aD7Leqp27F653aBkYkRBkEQyeKxfaZPyDx0O8CzWg=s0")
                        .build())
                .headerImage(HeaderImage.builder()
                        .guid("29a2a516-f1d2-4713-9cbd-7a4458026057")
                        .offsetPercentageX(0)
                        .offsetPercentageY(0)
                        .width(1920)
                        .height(460)
                        .url("https://lh3.googleusercontent.com/nAHNYM604vhPa1hbE_hBJw55JI01-ls0zCwHwvDEES38PpGyGHMgG_vaigVWSuK8GFkaxfn2Dmevw_Nmujn5dKW3jItgS6QaSI8VIsiH=s0")
                        .build())
                .productionPlaces(Collections.singletonList("Amsterdam"))
                .links(Links.builder()
                        .self("http://www.rijksmuseum.nl/api/en/collection/SK-C-5")
                        .web("http://www.rijksmuseum.nl/en/collection/SK-C-5")
                        .build())
                .build();
    }
}
