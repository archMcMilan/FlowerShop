package model.builder;

import model.bouquet.Accessory;
import model.bouquet.Bouquet;
import model.bouquet.BouquetEventType;
import model.bouquet.BouquetStemType;
import model.plant.Flower;

import java.util.Map;
import java.util.Set;

/**
 * Builder show which method must be implemented to create Bouquet
 */
public abstract class BouquetBuilder {
    protected Bouquet bouquet;

    /**
     * Method create Bouquet object
     */
    public void createBouquet(){
        this.bouquet=new Bouquet();
    }

    public abstract void buildBouquetFlowerMap();
    public abstract void buildBouquetAccessorySet();
    public abstract void buildBouquetStemType();

    public abstract void buildBouquetFlowerMap(Map<Flower,Integer> flowers);
    public abstract void buildBouquetAccessorySet(Set<Accessory> accessories);
    public abstract void buildBouquetStemType(BouquetStemType stem);
    public abstract void buildBouquetEventType(BouquetEventType event);

    public Bouquet getBouquet() {
        return bouquet;
    }
}
