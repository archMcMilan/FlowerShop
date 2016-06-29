package controller;

import model.Shop;
import model.bouquet.Bouquet;
import view.View;

import java.util.List;

/**
 * Created by Artem on 26.06.16.
 */
public class Controller {
    View view=new View();
    Shop shop;
    List<Bouquet> bouquets;

    public void processUser(){
        Initializer initializer=new Initializer();
        shop=initializer.init();

        InitializerBouquet initializerBouquet=new InitializerBouquet();
        bouquets=initializerBouquet.init();

        for(Bouquet b:bouquets){
            if(shop.bouquetMaker(b)){
                view.print(b.toString());
            }else {
                view.print(View.BOUQUET_MAKING_ERROR);
                view.print(b.toString());
                break;
            }
        }

    }
}
