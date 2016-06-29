package model.plant;

/**
 * Created by Artem on 26.06.16.
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
