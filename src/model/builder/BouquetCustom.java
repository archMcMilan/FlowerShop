package model.builder;

import model.bouquet.Accessory;
import model.bouquet.BouquetEventType;
import model.bouquet.BouquetStemType;
import model.plant.Flower;

import java.util.Map;
import java.util.Set;

/**
 * Class contains class that implements BouquetBuilder and set user parameters
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
    public void buildBouquetFlowerMap(Map<Flower,Integer> flowers) {
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
    public void buildBouquetFlowerMap() {

    }

    @Override
    public void buildBouquetAccessorySet() {

    }

}
