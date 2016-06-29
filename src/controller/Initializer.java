package controller;

import model.Shop;
import model.bouquet.Accessory;

/**
 * Created by Artem on 29.06.16.
 */
public class Initializer{
    public Shop init(){
        Shop shop=new Shop();
        for(InitializerFlower initF:InitializerFlower.values()){
            shop.addFlowers(initF.getFlower(),(int)(Math.random()*30+10));
        }
        for(Accessory a:Accessory.values()){
            shop.addAccessory(a,(int)(Math.random()*30+10));
        }
        return shop;
    }
}
