package rijksmuseum.artObject.model;

import lombok.Data;

@Data
public class DimensionsItem{
	private String unit;
	private Object precision;
	private Object part;
	private String type;
	private String value;
}