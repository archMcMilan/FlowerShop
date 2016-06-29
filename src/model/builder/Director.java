package model.builder;

import model.bouquet.Accessory;
import model.bouquet.Bouquet;
import model.bouquet.BouquetEventType;
import model.bouquet.BouquetStemType;
import model.plant.Flower;

import java.util.Map;
import java.util.Set;

/**
 * Class decide which Builder use for Bouquet creating
 */
public class Director {
    private BouquetBuilder builder;

    public void setBouquetBuilder(BouquetBuilder builder){
        this.builder=builder;
    }

    /**
     * Method which is a wrapper with parameters for Builder methods
     * @param flowers
     * @param accessories
     * @param stem
     * @param event
     * @return created Bouquet
     */
    public Bouquet createBouquet(Map<Flower,Integer> flowers, Set<Accessory> accessories, BouquetStemType stem, BouquetEventType event){
        builder.createBouquet();
        builder.buildBouquetFlowerMap(flowers);
        builder.buildBouquetAccessorySet(accessories);
        builder.buildBouquetStemType(stem);
        builder.buildBouquetEventType(event);

        return builder.getBouquet();
    }

    /**
     * Method which is a wrapper without parameters for Builder methods
     * @return created Bouquet
     */
    public Bouquet createBouquet(){
        builder.createBouquet();
        builder.buildBouquetFlowerMap();
        builder.buildBouquetAccessorySet();
        builder.buildBouquetStemType();

        return builder.getBouquet();
    }

}
