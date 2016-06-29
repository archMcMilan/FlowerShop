package model.builder;

import controller.InitializerFlower;
import model.bouquet.Accessory;
import model.bouquet.BouquetEventType;
import model.bouquet.BouquetSizeType;
import model.bouquet.BouquetStemType;
import model.plant.Flower;

import java.util.List;
import java.util.Set;

/**
 * Created by Artem on 26.06.16.
 */
public class BouquetPreSet {
    public static class Cheap extends BouquetBuilder {

        @Override
        public void buildBouquetStemType() {
            bouquet.setStem(BouquetStemType.NO_STEM);
        }

        @Override
        public void buildBouquetFlowerList() {
            for(int i=0;i<BouquetSizeType.SMALL.getFlowerAmount();i++){
                bouquet.getFlowers().add(InitializerFlower.CAMANOLI.getFlower());
            }
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
        public void buildBouquetFlowerList(List<Flower> flowers) {
            buildBouquetFlowerList();
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
        public void buildBouquetFlowerList() {
            for(int i=0;i<BouquetSizeType.MIDDLE.getFlowerAmount();i++){
                bouquet.getFlowers().add(InitializerFlower.NORMAL.getFlower());
            }
        }

        @Override
        public void buildBouquetAccessorySet() {
            bouquet.getAccessories().add(Accessory.FLOWER_WRAP);
            bouquet.getAccessories().add(Accessory.RIBBON);
        }

        @Override
        public void buildBouquetStemType(BouquetStemType stem) {
            buildBouquetStemType();
        }

        @Override
        public void buildBouquetFlowerList(List<Flower> flowers) {
            buildBouquetFlowerList();
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
        public void buildBouquetFlowerList() {
            for(int i=0;i<BouquetSizeType.BIG.getFlowerAmount();i++){
                bouquet.getFlowers().add(InitializerFlower.BETTER.getFlower());
            }
        }

        @Override
        public void buildBouquetAccessorySet() {
            bouquet.getAccessories().add(Accessory.FLOWER_WRAP);
            bouquet.getAccessories().add(Accessory.RIBBON);
            bouquet.getAccessories().add(Accessory.FLOWER_BASE);
        }

        @Override
        public void buildBouquetStemType(BouquetStemType stem) {
            buildBouquetStemType();
        }

        @Override
        public void buildBouquetFlowerList(List<Flower> flowers) {
            buildBouquetFlowerList();
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
        public void buildBouquetFlowerList() {
            for(int i=0;i<BouquetSizeType.VERY_BIG.getFlowerAmount();i++){
                bouquet.getFlowers().add(InitializerFlower.BEST.getFlower());
            }
        }

        @Override
        public void buildBouquetAccessorySet() {
            bouquet.getAccessories().add(Accessory.FLOWER_WRAP);
            bouquet.getAccessories().add(Accessory.RIBBON);
            bouquet.getAccessories().add(Accessory.FLOWER_BASE);
            bouquet.getAccessories().add(Accessory.BASKET);
        }

        @Override
        public void buildBouquetStemType(BouquetStemType stem) {
            buildBouquetStemType();
        }

        @Override
        public void buildBouquetFlowerList(List<Flower> flowers) {
            buildBouquetFlowerList();
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
