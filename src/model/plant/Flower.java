package model.plant;

/**
 * Created by Artem on 26.06.16.
 */
public class Flower extends Plant {
    private FlowerColorType colorType;
    private FreshnessType freshness;
    private boolean needFood;
    private boolean needSupport;

    public Flower(String name, int price, FlowerColorType colorType, FreshnessType freshness, boolean needFood, boolean needSupport) {
        super(name, price);
        this.colorType = colorType;
        this.freshness = freshness;
        this.needFood = needFood;
        this.needSupport = needSupport;
    }

    public FreshnessType getFreshness() {
        return freshness;
    }
}