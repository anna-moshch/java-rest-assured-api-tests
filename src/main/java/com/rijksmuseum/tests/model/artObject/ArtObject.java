package com.rijksmuseum.tests.model.artObject;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
public class ArtObject{
	//TODO: need to add XmlElement for all needed fields to verify XML format, or create a custom decoder for all elements
	private List<Object> associations;
	@XmlElement(name="SCLabelLine")
	private String scLabelLine;
	private String principalOrFirstMaker;
	private Object labelText;
	@XmlElement(name="PrincipalMaker")
	private String principalMaker;
	@XmlElement(name="ObjectNumber")
	private String objectNumber;
	private List<NormalizedColorsItem> normalizedColors;
	@XmlElement(name="Description")
	private String description;
	@XmlElement(name="Language")
	private String language;
	private List<PrincipalMakersItem> principalMakers;
	private boolean hasImage;
	private boolean showImage;
	@XmlElement(name="Title")
	private String title;
	private List<ColorsItem> colors;
	private List<Object> physicalProperties;
	@XmlElement(name="PhysicalMedium")
	private String physicalMedium;
	private WebImage webImage;
	@XmlElement(name="SubTitle")
	private String subTitle;
	private Object copyrightHolder;
	private Object artistRole;
	@XmlElement(name="PlaqueDescriptionEnglish")
	private String plaqueDescriptionEnglish;
	private List<Object> catRefRPK;
	private Links links;
	private String priref;
	private Dating dating;
	@XmlElement(name="Id")
	private String id;
	@XmlElement(name="Acquisition")
	private Acquisition acquisition;
	private List<String> objectCollection;
	private List<ColorsWithNormalizationItem> colorsWithNormalization;
	private List<Object> makers;
	private List<Object> inscriptions;
	private List<String> documentation;
	private List<String> productionPlaces;
	private List<Normalized32ColorsItem> normalized32Colors;
	@XmlElement(name="Titles")
	private List<String> titles;
	@XmlElement(name="Label")
	private Label label;
	@XmlElement(name="PlaqueDescriptionDutch")
	private String plaqueDescriptionDutch;
	private Classification classification;
	private List<String> historicalPersons;
	@XmlElement(name="Materials")
	private List<String> materials;
	private List<Object> techniques;
	private List<Object> exhibitions;
	private String location;
	private List<String> objectTypes;
	private List<DimensionsItem> dimensions;
	@XmlElement(name="LongTitle")
	private String longTitle;
}