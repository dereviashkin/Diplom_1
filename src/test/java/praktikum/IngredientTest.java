package praktikum;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static praktikum.IngredientType.SAUCE;
import static praktikum.RandomHelper.*;

@RunWith(Parameterized.class)
public class IngredientTest {

    private IngredientType type;
    private String name;
    private float price;

    public IngredientTest(IngredientType type, String name, float price) {
        this.type = type;
        this.name = name;
        this.price = price;
    }

    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][]{
                {ingredienTypetGenerator(), stringGenerator(), priceGenerator()},
                {ingredienTypetGenerator(), stringGenerator(), priceGenerator()},
                {ingredienTypetGenerator(), stringGenerator(), priceGenerator()},
                {ingredienTypetGenerator(), stringGenerator(), priceGenerator()},
                {ingredienTypetGenerator(), stringGenerator(), priceGenerator()},
        };
    }

    @Test
    public void getPrice() {
        Ingredient ingredient = new Ingredient(type, name, price);
        Assert.assertEquals(ingredient.getPrice(), price, 0);
        System.out.println(price);
    }

    @Test
    public void getName() {
        Ingredient ingredient = new Ingredient(type, name, price);
        Assert.assertEquals(ingredient.getName(), name);
    }

    @Test
    public void getType() {
        Ingredient ingredient = new Ingredient(type, name, price);
        Assert.assertEquals(ingredient.getType(), type);
        System.out.println(type);
    }
}