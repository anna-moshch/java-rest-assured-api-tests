package com.rijksmuseum.tests.model.artObject;

import lombok.Data;

import java.util.List;

@Data
public class LevelsItem {
    private List<TilesItem> tiles;
    private String name;
    private int width;
    private int height;
}