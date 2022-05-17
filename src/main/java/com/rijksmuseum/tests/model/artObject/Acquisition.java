package com.rijksmuseum.tests.model.artObject;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
public class Acquisition{
	@XmlElement(name="Date")
	private String date;
	@XmlElement(name="Method")
	private String method;
	@XmlElement(name="CreditLine")
	private String creditLine;
}
