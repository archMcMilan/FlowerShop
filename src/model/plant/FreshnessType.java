package model.plant;

/**
 * Created by Artem on 26.06.16.
 */
public enum FreshnessType {
    VERY_FRESH(2),
    FRESH(1.5),
    BAD(1),
    WILTED(0.5);

    private double coefficient;

    FreshnessType(double coefficient) {
        this.coefficient = coefficient;
    }

    public double getCoefficient() {
        return coefficient;
    }
}
