package rijksmuseum.model.objectMetaData.responces;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import rijksmuseum.model.objectMetaData.ArtObject;
import rijksmuseum.model.objectMetaData.ArtObjectPage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement(name = "artObjectGetResponse")
@XmlAccessorType(XmlAccessType.FIELD)
public class ArtObjectGetResponse {
	private ArtObjectPage artObjectPage;
	@XmlElement(name="ArtObject")
	private ArtObject artObject;
	@XmlElement(name="ElapsedMilliseconds")
	private int elapsedMilliseconds;
}
