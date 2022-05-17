package com.rijksmuseum.tests.model.artObject;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@XmlAccessorType(XmlAccessType.FIELD)
public class Label {
    @XmlElement(name = "Date")
    private String date;
    @XmlElement(name = "Description")
    private String description;
    @XmlElement(name = "Title")
    private String title;
    @XmlElement(name = "MakerLine")
    private String makerLine;
}
