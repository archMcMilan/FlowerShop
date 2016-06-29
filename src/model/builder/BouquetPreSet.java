package model.builder;

import controller.InitializerFlower;
import model.bouquet.Accessory;
import model.bouquet.BouquetEventType;
import model.bouquet.BouquetSizeType;
import model.bouquet.BouquetStemType;
import model.plant.Flower;

import java.util.Map;
import java.util.Set;

/**
 * Class contains four classes that implements BouquetBuilder and set "preset" parameters
 */
public class BouquetPreSet {
    public static class Cheap extends BouquetBuilder {

        @Override
        public void buildBouquetStemType() {
            bouquet.setStem(BouquetStemType.NO_STEM);
        }

        @Override
        public void buildBouquetFlowerMap() {
            bouquet.getFlowers().put(InitializerFlower.СHAMOMILE.getFlower(),BouquetSizeType.SMALL.getFlowerAmount());
        }

        @Override
        public void buildBouquetAccessorySet() {
            bouquet.getAccessories().add(Accessory.RIBBON);
        }

        @Override
        public void buildBouquetStemType(BouquetStemType stem) {
            buildBouquetStemType();
        }

        @Override
        public void buildBouquetFlowerMap(Map<Flower, Integer> flowers) {
            buildBouquetFlowerMap();
        }

        @Override
        public void buildBouquetAccessorySet(Set<Accessory> accessories) {
            buildBouquetAccessorySet();
        }

        @Override
        public void buildBouquetEventType(BouquetEventType event) {
            bouquet.setEvent(event);
        }
    }


    public static class Budget extends BouquetBuilder{

        @Override
        public void buildBouquetStemType() {
            bouquet.setStem(BouquetStemType.SMALL);
        }

        @Override
        public void buildBouquetFlowerMap() {
            bouquet.getFlowers().put(InitializerFlower.TULIP.getFlower(),BouquetSizeType.MIDDLE.getFlowerAmount());
        }

        @Override
        public void buildBouquetAccessorySet() {
            bouquet.getAccessories().add(Accessory.WRAPPER);
            bouquet.getAccessories().add(Accessory.RIBBON);
        }

        @Override
        public void buildBouquetStemType(BouquetStemType stem) {
            buildBouquetStemType();
        }

        @Override
        public void buildBouquetFlowerMap(Map<Flower, Integer> flowers) {
            buildBouquetFlowerMap();
        }
        @Override
        public void buildBouquetAccessorySet(Set<Accessory> accessories) {
            buildBouquetAccessorySet();
        }

        @Override
        public void buildBouquetEventType(BouquetEventType event) {
            bouquet.setEvent(event);
        }
    }

    public static class Expensive extends BouquetBuilder{

        @Override
        public void buildBouquetStemType() {
            bouquet.setStem(BouquetStemType.MEDIUM);
        }

        @Override
        public void buildBouquetFlowerMap() {
            bouquet.getFlowers().put(InitializerFlower.ORCHID.getFlower(),BouquetSizeType.BIG.getFlowerAmount());
        }

        @Override
        public void buildBouquetAccessorySet() {
            bouquet.getAccessories().add(Accessory.WRAPPER);
            bouquet.getAccessories().add(Accessory.RIBBON);
            bouquet.getAccessories().add(Accessory.BASE);
        }

        @Override
        public void buildBouquetStemType(BouquetStemType stem) {
            buildBouquetStemType();
        }

        @Override
        public void buildBouquetFlowerMap(Map<Flower, Integer> flowers) {
            buildBouquetFlowerMap();
        }
        @Override
        public void buildBouquetAccessorySet(Set<Accessory> accessories) {
            buildBouquetAccessorySet();
        }

        @Override
        public void buildBouquetEventType(BouquetEventType event) {
            bouquet.setEvent(event);
        }
    }

    public static class VIP extends BouquetBuilder{

        @Override
        public void buildBouquetStemType() {
            bouquet.setStem(BouquetStemType.LONG);
        }

        @Override
        public void buildBouquetFlowerMap() {
            bouquet.getFlowers().put(InitializerFlower.ROSE.getFlower(),BouquetSizeType.VERY_BIG.getFlowerAmount());
        }

        @Override
        public void buildBouquetAccessorySet() {
            bouquet.getAccessories().add(Accessory.WRAPPER);
            bouquet.getAccessories().add(Accessory.RIBBON);
            bouquet.getAccessories().add(Accessory.BASE);
            bouquet.getAccessories().add(Accessory.BASKET);
        }

        @Override
        public void buildBouquetStemType(BouquetStemType stem) {
            buildBouquetStemType();
        }

        @Override
        public void buildBouquetFlowerMap(Map<Flower, Integer> flowers) {
            buildBouquetFlowerMap();
        }
        @Override
        public void buildBouquetAccessorySet(Set<Accessory> accessories) {
            buildBouquetAccessorySet();
        }

        @Override
        public void buildBouquetEventType(BouquetEventType event) {
            bouquet.setEvent(event);
        }
    }

}
