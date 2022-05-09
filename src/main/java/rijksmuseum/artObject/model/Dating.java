package rijksmuseum.artObject.model;

import lombok.Data;

@Data
public class Dating{
	private int period;
	private int sortingDate;
	private int yearLate;
	private int yearEarly;
	private String presentingDate;
}
