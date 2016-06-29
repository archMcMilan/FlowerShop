package model.bouquet;

/**
 * Enum of bouquet size available.
 */
public enum BouquetSizeType {
    SMALL(3), MIDDLE(7), BIG(21), VERY_BIG(101);

    private int flowerAmount;

    BouquetSizeType(int flowerAmount) {
        this.flowerAmount = flowerAmount;
    }

    public int getFlowerAmount() {
        return flowerAmount;
    }
}
