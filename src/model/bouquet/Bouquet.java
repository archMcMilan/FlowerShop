package model.bouquet;

import model.plant.Flower;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Artem on 26.06.16.
 */
public class Bouquet {
    private List<Flower> flowers;
    private Set<Accessory> accessories;
    private BouquetEventType event;
    private BouquetStemType stem;

    public Bouquet() {
        flowers=new ArrayList<>();
        accessories=new LinkedHashSet<>();
        event=BouquetEventType.ALL;
    }

    public Bouquet(List<Flower> flowers, Set<Accessory> accessories, BouquetEventType event, BouquetStemType stem) {
        this.flowers = flowers;
        this.accessories = accessories;
        this.event = event;
        this.stem = stem;
    }


    public int countPrice(){
        int sum=0;
        for(Flower f:flowers){
            sum+=f.getPrice()*f.getFreshness().getCoefficient();
        }
        for(Accessory a:accessories){
            sum+=a.getPrice();
        }
        sum*=stem.getCoefficient();
        return sum;
    }

    public void setFlowers(List<Flower> flowers) {
        this.flowers = flowers;
    }

    public void setAccessories(Set<Accessory> accessories) {
        this.accessories = accessories;
    }

    public void setEvent(BouquetEventType event) {
        this.event = event;
    }

    public void setStem(BouquetStemType stem) {
        this.stem = stem;
    }

    public List<Flower> getFlowers() {
        return flowers;
    }

    public Set<Accessory> getAccessories() {
        return accessories;
    }

    public BouquetEventType getEvent() {
        return event;
    }

    public BouquetStemType getStem() {
        return stem;
    }


}
