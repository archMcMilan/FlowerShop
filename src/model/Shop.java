package model;

import model.bouquet.Accessory;
import model.bouquet.Bouquet;
import model.plant.Flower;
import model.plant.FreshnessType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Artem on 26.06.16.
 */
public class Shop {
    Map<Flower,Integer> flowers=new HashMap<>();
    Map<Accessory,Integer> accessories=new HashMap<>();

    public boolean addFlowers(List<Flower> flowers){
        for(Flower f:flowers){
            try {
                this.flowers.put(f,this.flowers.get(f)+1);
            }catch (Exception e){
                return false;
            }
        }
        return true;

    }

    public boolean addAccessory(List<Accessory> accessories){
        for(Accessory a:accessories){
            try {
                this.accessories.put(a,this.accessories.get(a)+1);
            }catch (Exception e){
                return false;
            }
        }
        return true;

    }

    public Bouquet bouquetMaker(Bouquet bouquet){
        for(Flower f:bouquet.getFlowers()){
            if()
        }
        for(Map.Entry<Flower,Integer> entry:flowers.entrySet()){
        }
    }

    public int amountOfWilted(){
        int removeAmount=0;
        for(Map.Entry<Flower,Integer> entry:flowers.entrySet()){
            if(entry.getKey().getFreshness()==FreshnessType.WILTED){
                removeAmount++;
            }
        }
        return removeAmount;
    }

    public List<Flower> removeWilted(){
        List<Flower> wilted=new ArrayList<>();
        for(Map.Entry<Flower,Integer> entry:flowers.entrySet()){
            if(entry.getKey().getFreshness()==FreshnessType.WILTED){
                wilted.add(entry.getKey());
                entry.setValue(entry.getValue()-1);
            }
        }
        return wilted;
    }


}
