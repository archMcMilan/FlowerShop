package model.bouquet;

/**
 * Enum of Accessories available
 */
public enum Accessory {
    BASKET(25), RIBBON(10), BASE(15), WRAPPER(10);

    private final int price;

    Accessory(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
