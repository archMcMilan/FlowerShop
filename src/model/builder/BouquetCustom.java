package model.builder;

import model.bouquet.Accessory;
import model.bouquet.BouquetEventType;
import model.bouquet.BouquetStemType;
import model.plant.Flower;

import java.util.List;
import java.util.Set;

/**
 * Created by Artem on 26.06.16.
 */
public class BouquetCustom extends BouquetBuilder{

    @Override
    public void buildBouquetStemType(BouquetStemType stem) {
        bouquet.setStem(stem);
    }

    @Override
    public void buildBouquetEventType(BouquetEventType event) {
        bouquet.setEvent(event);
    }

    @Override
    public void buildBouquetFlowerList(List<Flower> flowers) {
        bouquet.setFlowers(flowers);
    }

    @Override
    public void buildBouquetAccessorySet(Set<Accessory> accessories){
        bouquet.setAccessories(accessories);
    }

    @Override
    public void buildBouquetStemType() {

    }

    @Override
    public void buildBouquetFlowerList() {

    }

    @Override
    public void buildBouquetAccessorySet() {

    }

}
