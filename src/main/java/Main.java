import javax.xml.crypto.Data;
import java.util.List;

import static java.time.Instant.now;

public class Main {
    public static void main(String[] args) {
        DataRetriever dataRetriever = new DataRetriever();

        Ingredient ingredientOne = dataRetriever.findIngredientById(1);
        System.out.println(ingredientOne.getStockValueAt(now()));
        System.out.println(dataRetriever.getStockValueAt(now(), 1));

    }
}
