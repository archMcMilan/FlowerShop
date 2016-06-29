package model.bouquet;

/**
 * Enum of bouquet stems available
 */
public enum BouquetStemType {
        NO_STEM(0.5),
        SMALL(1.),
        MEDIUM(1.5),
        LONG(2.);

        private double coefficient;

        BouquetStemType(double coefficient) {
                this.coefficient = coefficient;
        }

        public double getCoefficient() {
                return coefficient;
        }
}
