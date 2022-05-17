package com.rijksmuseum.tests.model.responces;

import lombok.Data;
import com.rijksmuseum.tests.model.artObject.ArtObjectsItem;
import com.rijksmuseum.tests.model.artObject.CountFacets;
import com.rijksmuseum.tests.model.artObject.FacetsItem;

import java.util.List;

@Data
public class GetCollectionResponse {
	private List<ArtObjectsItem> artObjects;
	private CountFacets countFacets;
	private int count;
	private int elapsedMilliseconds;
	private List<FacetsItem> facets;
}