package com.rijksmuseum.tests.model.artObject;

import lombok.Data;

import java.util.List;

@Data
public class Classification{
	private List<String> iconClassIdentifier;
	private List<String> places;
	private List<Object> motifs;
	private List<Object> periods;
	private List<String> objectNumbers;
	private List<String> people;
	private List<Object> events;
	private List<String> iconClassDescription;
}