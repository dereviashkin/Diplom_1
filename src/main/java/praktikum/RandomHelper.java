package praktikum;

import java.util.Random;
import java.util.UUID;

public class RandomHelper {

    private static Random random = new Random();

    public static String stringGenerator() {
        return UUID.randomUUID().toString().replace("-", "").substring(0, 5);
    }

    public static float priceGenerator() {
        return Math.round(random.nextFloat() * 100);
    }

    public static IngredientType ingredienTypetGenerator() {
        random.nextInt(IngredientType.values().length);
        return IngredientType.values()[random.nextInt(IngredientType.values().length)];
    }
}
