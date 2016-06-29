package model.bouquet;

/**
 * Created by Artem on 26.06.16.
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
