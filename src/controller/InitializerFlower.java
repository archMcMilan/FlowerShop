package controller;

import model.plant.Flower;
import model.plant.FlowerColorType;
import model.plant.FreshnessType;

/**
 * Created by Artem on 26.06.16.
 */
public enum InitializerFlower {
    СHAMOMILE("СHAMOMILE",20,FlowerColorType.SINGLE_COLOR,FreshnessType.BAD,true,true),
    TULIP("TULIP",30,FlowerColorType.SINGLE_COLOR,FreshnessType.FRESH,true,false),
    ORCHID("ORCHID",40,FlowerColorType.SEVERAL_COLORS,FreshnessType.FRESH,false,true),
    ROSE("ROSE",50,FlowerColorType.SEVERAL_COLORS,FreshnessType.VERY_FRESH,false,false),
    HYDRANGEA("HYDRANGEA",35,FlowerColorType.SEVERAL_COLORS,FreshnessType.FRESH,true,false);

    private Flower flower;

    InitializerFlower(String name, int price, FlowerColorType colorType, FreshnessType freshness,boolean needFood, boolean needSupport) {
        flower=new Flower(name,price,colorType,freshness,needFood,needSupport);
    }

    public Flower getFlower() {
        return flower;
    }
}
