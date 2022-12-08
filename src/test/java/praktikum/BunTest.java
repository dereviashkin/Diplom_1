package praktikum;

import org.junit.Assert;
import org.junit.Test;

public class BunTest {

    Bun bun = new Bun("test", 100);
    float expectedPrice = 100;
    String expectedName = "test";

    @Test
    public void getNameCorrectSuccess() {
        String result = bun.getName();
        Assert.assertEquals(result, expectedName);
    }

    @Test
    public void getPriceCorrectSuccess() {
        float result = bun.getPrice();
        Assert.assertEquals(result, expectedPrice, 0);
    }
}