package com.rijksmuseum.tests.model.artObject;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ArtObjectsItem {
    private String principalOrFirstMaker;
    private WebImage webImage;
    private HeaderImage headerImage;
    private String objectNumber;
    private List<String> productionPlaces;
    private Links links;
    private boolean hasImage;
    private boolean showImage;
    private String id;
    private String title;
    private String longTitle;
    private boolean permitDownload;
}