package model.bouquet;

import model.plant.Flower;

import java.util.*;

/**
 * Class contains parameters for that need to know for creating Bouquet
 * Contain method that count price of this bouquet
 */
public class Bouquet {
    private Map<Flower, Integer> flowers;
    private Set<Accessory> accessories;
    private BouquetEventType event;
    private BouquetStemType stem;

    public Bouquet() {
        flowers = new HashMap<>();
        accessories = new LinkedHashSet<>();
        event = BouquetEventType.ALL;
    }

    public int countPrice() {
        int sum = 0;
        for (Map.Entry<Flower, Integer> entry : flowers.entrySet()) {
            sum += entry.getKey().getPrice() * entry.getKey().getFreshness().getCoefficient() * entry.getValue();
        }
        for (Accessory a : accessories) {
            sum += a.getPrice();
        }
        sum *= stem.getCoefficient();
        return sum;
    }

    public void setFlowers(Map<Flower, Integer> flowers) {
        this.flowers = flowers;
    }

    public void setAccessories(Set<Accessory> accessories) {
        this.accessories = accessories;
    }

    public void setEvent(BouquetEventType event) {
        this.event = event;
    }

    public void setStem(BouquetStemType stem) {
        this.stem = stem;
    }

    public Map<Flower, Integer> getFlowers() {
        return flowers;
    }

    public Set<Accessory> getAccessories() {
        return accessories;
    }

    public BouquetEventType getEvent() {
        return event;
    }

    public BouquetStemType getStem() {
        return stem;
    }

    @Override
    public String toString() {
        return "Bouquet{" +
                "flowers=" + flowers +
                ", accessories=" + accessories +
                ", event=" + event +
                ", stem=" + stem +
                '}';
    }
}
