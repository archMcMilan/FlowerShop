package model.plant;

/**
 * Class contains similar fields for Flower and NotFlower
 */
public abstract class Plant {
    private String name;
    private int price;

    public Plant(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
