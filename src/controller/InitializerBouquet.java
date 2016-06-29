package controller;

import model.bouquet.Accessory;
import model.bouquet.Bouquet;
import model.bouquet.BouquetEventType;
import model.bouquet.BouquetStemType;
import model.builder.BouquetCustom;
import model.builder.BouquetPreSet;
import model.builder.Director;
import model.plant.Flower;
import model.plant.FlowerColorType;
import model.plant.FreshnessType;

import java.util.*;

/**
 * Created by Artem on 26.06.16.
 */
public class InitializerBouquet {

    public void init(){
        Director director=new Director();
        List<Bouquet> bouquets=new ArrayList<>();
        director.setBouquetBuilder(new BouquetPreSet.Cheap());
        bouquets.add(director.createBouquet());
        director.setBouquetBuilder(new BouquetPreSet.Expensive());
        bouquets.add(director.createBouquet());
        director.setBouquetBuilder(new BouquetPreSet.VIP());
        bouquets.add(director.createBouquet());

        List<Flower> flowers=new ArrayList<>();
        Flower rose=new Flower(this.getClass().getName(),200, FlowerColorType.SEVERAL_COLORS, FreshnessType.FRESH,
                true, false);
        flowers.add(rose);
        flowers.add(rose);
        flowers.add(rose);
        Flower rose2=new Flower(this.getClass().getName(),300, FlowerColorType.SEVERAL_COLORS, FreshnessType.VERY_FRESH,
                false, false);
        flowers.add(rose2);
        flowers.add(rose2);
        flowers.add(rose);

        Set<Accessory> accessories=new HashSet<>();
        accessories.add(Accessory.BASKET);
        accessories.add(Accessory.RIBBON);
        accessories.add(Accessory.FLOWER_BASE);
        accessories.add(Accessory.FLOWER_WRAP);
        director.setBouquetBuilder(new BouquetCustom());
        bouquets.add(director.createBouquet(flowers,accessories, BouquetStemType.MEDIUM, BouquetEventType.WEDDING));
    }
}
