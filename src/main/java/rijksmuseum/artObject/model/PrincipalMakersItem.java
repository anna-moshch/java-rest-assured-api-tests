package rijksmuseum.artObject.model;

import lombok.Data;

import java.util.List;


@Data
public class PrincipalMakersItem{
	private String placeOfBirth;
	private List<String> occupation;
	private String dateOfDeath;
	private List<String> roles;
	private List<String> productionPlaces;
	private String dateOfBirth;
	private String placeOfDeath;
	private Object biography;
	private Object dateOfDeathPrecision;
	private Object qualification;
	private Object nationality;
	private String unFixedName;
	private String name;
	private String labelDesc;
	private Object dateOfBirthPrecision;
}