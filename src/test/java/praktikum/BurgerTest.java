package praktikum;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static praktikum.IngredientType.SAUCE;

@RunWith(MockitoJUnitRunner.class)
public class BurgerTest {

    Burger burger = new Burger();

    @Mock
    Bun bun;
    @Mock
    Ingredient ingredient;
    @Mock
    Ingredient anotherIngredient;

    @Test
    public void setBunsCorrectSuccess() {
        burger.setBuns(bun);
        Assert.assertEquals(burger.bun, bun);
    }

    @Test
    public void addIngredientCorrectSuccess() {
        int expected = 1;
        burger.addIngredient(ingredient);
        Assert.assertEquals(expected, burger.ingredients.size());
    }

    @Test
    public void removeIngredientCorrectSuccess() {

        int expected = 0;
        burger.addIngredient(ingredient);
        burger.removeIngredient(0);
        Assert.assertEquals(burger.ingredients.size(), expected);
    }

    @Test
    public void moveIngredientCorrectSuccess() {
        burger.addIngredient(ingredient);
        for (int i = 0; i < 4; i++) {
            burger.addIngredient(anotherIngredient);
        }
        burger.moveIngredient(0, 4);
        Assert.assertEquals(burger.ingredients.get(4), ingredient);
    }

    @Test
    public void getPriceCorrectSuccess() {
        burger.setBuns(bun);
        burger.addIngredient(ingredient);
        Mockito.when(bun.getPrice()).thenReturn(2F);
        Mockito.when(ingredient.getPrice()).thenReturn(2F);
        float expected = 6F;
        float actual = burger.getPrice();
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void getReceiptCorrectSuccess() {
        burger.setBuns(bun);
        burger.addIngredient(ingredient);
        Mockito.when(bun.getName()).thenReturn("black bun");
        Mockito.when(ingredient.getType()).thenReturn(SAUCE);
        Mockito.when(ingredient.getName()).thenReturn("sour cream");
        Mockito.when(burger.getPrice()).thenReturn(100F);
        String expected = "(==== black bun ====)\r\n" +
                "= sauce sour cream =\r\n" +
                "(==== black bun ====)\r\n" +
                "\r\nPrice: 100,000000\r\n";
        String actual = burger.getReceipt();
        Assert.assertEquals(expected, actual);
    }
}