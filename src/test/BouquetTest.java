package test;


import model.bouquet.Bouquet;
import model.builder.BouquetPreSet;
import model.builder.Director;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Artem on 29.06.16.
 */
public class BouquetTest {

    Director director=new Director();

    @Test
    public void countPriceTest() throws Exception {
        director.setBouquetBuilder(new BouquetPreSet.Budget());
        Bouquet bouquet=director.createBouquet();
        Assert.assertEquals(bouquet.countPrice(),335);
    }

}