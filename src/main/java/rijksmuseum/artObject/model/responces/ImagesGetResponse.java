package rijksmuseum.artObject.model.responces;

import lombok.Data;
import rijksmuseum.artObject.model.LevelsItem;

import java.util.List;

@Data
public class ImagesGetResponse {
	private List<LevelsItem> levels;
}