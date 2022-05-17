package com.rijksmuseum.tests.model.responces;

import com.rijksmuseum.tests.model.artObject.LevelsItem;
import lombok.Data;

import java.util.List;

@Data
public class GetImagesResponse {
	private List<LevelsItem> levels;
}