package rijksmuseum.artObject.model;

import lombok.Data;

@Data
public class Label{
	private String date;
	private Object notes;
	private String description;
	private String title;
	private String makerLine;
}
