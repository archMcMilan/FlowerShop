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
 * Class Shop contains Flower and Accessory map that available now to use
 * And method to add Flowers and Accessories to maps, drop wilted and check possibility of creation such Bouquet
 */
public class Shop {
    Map<Flower,Integer> flowers;
    Map<Accessory,Integer> accessories;


    public Shop() {
        flowers=new HashMap<Flower,Integer>();
        accessories=new HashMap<Accessory,Integer>();
    }

    /**
     * Add map of Flowers to existed map
     * @param flowers
     * @return true if operation made successfully otherwise(exception thrown) false
     */
    public boolean addFlowers(Map<Flower,Integer> flowers){
        for(Map.Entry<Flower,Integer> entry:flowers.entrySet()){
            try {
                if(this.flowers.get(entry.getKey())!=null){
                    this.flowers.put(entry.getKey(),this.flowers.get(entry.getKey())+entry.getValue());
                }else{
                    this.flowers.put(entry.getKey(),entry.getValue());
                }
            }catch (Exception e){
                return false;
            }
        }
        return true;
    }

    /**
     * Add amount of Flowers to existed map
     * @param flower
     * @param amount
     * @return true if operation made successfully otherwise(exception thrown) false
     */
    public boolean addFlowers(Flower flower,int amount){
        try {
            if(this.flowers.get(flower)!=null){
                this.flowers.put(flower,this.flowers.get(flower)+amount);
            }else{
                this.flowers.put(flower,amount);
            }
        }catch (Exception e){
            return false;
        }
        return true;
    }

    /**
     * Add map of Accessories to existed map
     * @param accessories
     * @return true if operation made successfully otherwise(exception thrown) false
     */
    public boolean addAccessory(List<Accessory> accessories){
        for(Accessory a:accessories){
            try {
                if(this.accessories.get(a)!=null){
                    this.accessories.put(a,this.accessories.get(a)+1);
                }else{
                    this.accessories.put(a,1);
                }
            }catch (Exception e){
                return false;
            }
        }
        return true;
    }

    /**
     * Add amount of Accessories to existed map
     * @param accessory
     * @param amount
     * @return true if operation made successfully otherwise(exception thrown) false
     */
    public boolean addAccessory(Accessory accessory,int amount){
        try {
            if(this.accessories.get(accessory)!=null){
                this.accessories.put(accessory,this.accessories.get(accessory)+amount);
            }else{
                this.accessories.put(accessory,amount);
            }

        }catch (Exception e){
            return false;
        }
        return true;
    }

    /**
     * Method check: can the Shop create such bouquet
     * @param bouquet
     * @return true if operation made successfully otherwise false
     */
    public boolean bouquetMaker(Bouquet bouquet){
        for(Map.Entry<Flower,Integer> entry:bouquet.getFlowers().entrySet()){
            if(flowers.get(entry.getKey())<entry.getValue()){
                return false;
            }
        }
        for(Map.Entry<Flower,Integer> entry:bouquet.getFlowers().entrySet()){
            flowers.put(entry.getKey(),flowers.get(entry.getKey())-entry.getValue());
        }
        return true;
    }

    /**
     * Method count amount of wilted Flowers in the Shop
     * @return counted amount
     */
    public int amountOfWilted(){
        int removeAmount=0;
        for(Map.Entry<Flower,Integer> entry:flowers.entrySet()){
            if(entry.getKey().getFreshness()==FreshnessType.WILTED){
                removeAmount++;
            }
        }
        return removeAmount;
    }

    /**
     * Method drop wilted Flowers from map
     * @return List of wilted Flowers
     */
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
