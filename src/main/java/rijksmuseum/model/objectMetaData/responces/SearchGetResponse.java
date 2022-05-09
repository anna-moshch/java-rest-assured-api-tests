package rijksmuseum.model.objectMetaData.responces;

import lombok.Data;
import rijksmuseum.model.objectMetaData.ArtObjectsItem;
import rijksmuseum.model.objectMetaData.CountFacets;
import rijksmuseum.model.objectMetaData.FacetsItem;

import java.util.List;

@Data
public class SearchGetResponse{
	private List<ArtObjectsItem> artObjects;
	private CountFacets countFacets;
	private int count;
	private int elapsedMilliseconds;
	private List<FacetsItem> facets;
}