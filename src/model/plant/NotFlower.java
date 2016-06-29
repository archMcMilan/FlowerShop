package model.plant;

/**
 * Created by Artem on 26.06.16.
 */
public class NotFlower extends Plant {
    private NotFlowerType type;


    public NotFlower(String name, int price,NotFlowerType type) {
        super(name, price);
    }
}
