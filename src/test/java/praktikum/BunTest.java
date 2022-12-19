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
        Assert.assertEquals("Имя булочки не соответствует ожидаемому", expectedName, result);
    }

    @Test
    public void getPriceCorrectSuccess() {
        float result = bun.getPrice();
        Assert.assertEquals("Цена булочки не соответствует ожидаемой", expectedPrice, result, 0);
    }
}