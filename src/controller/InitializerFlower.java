package controller;

import model.plant.Flower;
import model.plant.FlowerColorType;
import model.plant.FreshnessType;

/**
 * Created by Artem on 26.06.16.
 */
public enum InitializerFlower {
    CAMANOLI(InitializerFlower.CAMANOLI.getClass().getName(),20,FlowerColorType.SINGLE_COLOR,FreshnessType.BAD,true,true),
    NORMAL(InitializerFlower.NORMAL.getClass().getName(),30,FlowerColorType.SINGLE_COLOR,FreshnessType.BAD,true,false),
    BETTER(InitializerFlower.BETTER.getClass().getName(),40,FlowerColorType.SEVERAL_COLORS,FreshnessType.FRESH,false,true),
    BEST(InitializerFlower.BEST.getClass().getName(),50,FlowerColorType.SEVERAL_COLORS,FreshnessType.VERY_FRESH,false,false);


    private Flower flower;

    InitializerFlower(String name, int price, FlowerColorType colorType, FreshnessType freshness,boolean needFood, boolean needSupport) {
        flower=new Flower(name,price,colorType,freshness,needFood,needSupport);
    }

    public Flower getFlower() {
        return flower;
    }
}
