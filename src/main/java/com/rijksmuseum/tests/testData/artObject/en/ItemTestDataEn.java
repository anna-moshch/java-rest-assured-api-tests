package com.rijksmuseum.tests.testData.artObject.en;

import com.rijksmuseum.tests.model.artObject.ArtObjectsItem;
import com.rijksmuseum.tests.model.artObject.HeaderImage;
import com.rijksmuseum.tests.model.artObject.Links;
import com.rijksmuseum.tests.model.artObject.WebImage;
import com.rijksmuseum.tests.testData.artObject.ItemTestData;

import java.util.Collections;

public class ItemTestDataEn implements ItemTestData {

    public ArtObjectsItem getArtObjectItemForSearchResults() {
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
