package controller;

import model.bouquet.Accessory;
import model.bouquet.Bouquet;
import model.bouquet.BouquetEventType;
import model.bouquet.BouquetStemType;
import model.builder.BouquetCustom;
import model.builder.BouquetPreSet;
import model.builder.Director;
import model.plant.Flower;

import java.util.*;

/**
 * Created by Artem on 26.06.16.
 */
public class InitializerBouquet {

    public List<Bouquet> init(){
        Director director=new Director();
        List<Bouquet> bouquets=new ArrayList<>();
        director.setBouquetBuilder(new BouquetPreSet.Cheap());
        bouquets.add(director.createBouquet());
        director.setBouquetBuilder(new BouquetPreSet.Expensive());
        bouquets.add(director.createBouquet());
        director.setBouquetBuilder(new BouquetPreSet.Budget());
        bouquets.add(director.createBouquet());

        Map<Flower,Integer> flowers=new HashMap<>();
        flowers.put(InitializerFlower.ROSE.getFlower(),5);
        flowers.put(InitializerFlower.HYDRANGEA.getFlower(),3);

        Set<Accessory> accessories=new HashSet<>();
        accessories.add(Accessory.BASKET);
        accessories.add(Accessory.RIBBON);
        accessories.add(Accessory.BASE);
        accessories.add(Accessory.WRAPPER);
        director.setBouquetBuilder(new BouquetCustom());
        bouquets.add(director.createBouquet(flowers,accessories, BouquetStemType.MEDIUM, BouquetEventType.BRIDAL));
        return bouquets;
    }
}
