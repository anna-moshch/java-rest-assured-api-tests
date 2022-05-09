package rijksmuseum.model.objectMetaData;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
		import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class WebImage{
	private int offsetPercentageY;
	private int offsetPercentageX;
	private int width;
	private String guid;
	private String url;
	private int height;
}
