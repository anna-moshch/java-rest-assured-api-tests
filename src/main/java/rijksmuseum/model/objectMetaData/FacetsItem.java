package rijksmuseum.model.objectMetaData;

import lombok.Data;

import java.util.List;

@Data
public class FacetsItem{
	private int prettyName;
	private int otherTerms;
	private String name;
	private List<FacetsItem> facets;
	private int value;
	private String key;
}