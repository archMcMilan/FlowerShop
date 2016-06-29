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
public class Director {
    private BouquetBuilder builder;

    public void setBouquetBuilder(BouquetBuilder builder){
        this.builder=builder;
    }

    public Bouquet createBouquet(List<Flower> flowers, Set<Accessory> accessories,BouquetStemType stem,BouquetEventType event){
        builder.createBouquet();
        builder.buildBouquetFlowerList(flowers);
        builder.buildBouquetAccessorySet(accessories);
        builder.buildBouquetStemType(stem);
        builder.buildBouquetEventType(event);

        return builder.getBouquet();
    }

    public Bouquet createBouquet(){
        builder.createBouquet();
        builder.buildBouquetFlowerList();
        builder.buildBouquetAccessorySet();
        builder.buildBouquetStemType();

        return builder.getBouquet();
    }

}
