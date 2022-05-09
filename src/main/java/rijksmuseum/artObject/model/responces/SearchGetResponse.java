package rijksmuseum.artObject.model.responces;

import lombok.Data;
import rijksmuseum.artObject.model.ArtObjectsItem;
import rijksmuseum.artObject.model.CountFacets;
import rijksmuseum.artObject.model.FacetsItem;

import java.util.List;

@Data
public class SearchGetResponse{
	private List<ArtObjectsItem> artObjects;
	private CountFacets countFacets;
	private int count;
	private int elapsedMilliseconds;
	private List<FacetsItem> facets;
}