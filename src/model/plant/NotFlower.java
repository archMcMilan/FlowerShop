package model.plant;

/**
 * Class that extends Plant and contains special parameters for not a Flower
 */
public class NotFlower extends Plant {
    private NotFlowerType type;


    public NotFlower(String name, int price,NotFlowerType type) {
        super(name, price);
    }
}
