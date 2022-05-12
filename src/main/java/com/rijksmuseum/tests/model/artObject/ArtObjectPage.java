package com.rijksmuseum.tests.model.artObject;

import lombok.Data;

import java.util.List;


@Data
public class ArtObjectPage{
	private List<Object> similarPages;
	private Object audioFileLabel2;
	private AdlibOverrides adlibOverrides;
	private String objectNumber;
	private Object audioFileLabel1;
	private String id;
	private String plaqueDescription;
	private Object audioFile1;
	private String updatedOn;
	private String lang;
	private String createdOn;
	private List<Object> tags;
}