package model.builder;

import model.bouquet.Accessory;
import model.bouquet.Bouquet;
import model.bouquet.BouquetEventType;
import model.bouquet.BouquetStemType;
import model.plant.Flower;

import java.util.List;
import java.util.Set;

/**
 * Created by Artem on 26.06.16.
 */
public abstract class BouquetBuilder {
    protected Bouquet bouquet;

    public void createBouquet(){
        this.bouquet=new Bouquet();
    }

    public abstract void buildBouquetFlowerList();
    public abstract void buildBouquetAccessorySet();
    public abstract void buildBouquetStemType();

    public abstract void buildBouquetFlowerList(List<Flower> flowers);
    public abstract void buildBouquetAccessorySet(Set<Accessory> accessories);
    public abstract void buildBouquetStemType(BouquetStemType stem);
    public abstract void buildBouquetEventType(BouquetEventType event);

    public Bouquet getBouquet() {
        return bouquet;
    }
}
