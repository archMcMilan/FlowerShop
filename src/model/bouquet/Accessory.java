package model.bouquet;

/**
 * Created by Artem on 26.06.16.
 */
public enum Accessory {
    BASKET(25), RIBBON(20), FLOWER_BASE(15), FLOWER_WRAP(10);

    private final int price;

    Accessory(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
