package praktikum;

import org.junit.Assert;
import org.junit.Test;

import static praktikum.IngredientType.SAUCE;

public class IngredientTypeTest {

    @Test
    public void valuesNotNullSuccess() {
        Assert.assertNotNull(IngredientType.values());
    }

    @Test
    public void valueOfCorrectSuccess() {
        String expected = "SAUCE";
        Assert.assertEquals(IngredientType.valueOf(SAUCE.name()).toString(), expected);
    }
}