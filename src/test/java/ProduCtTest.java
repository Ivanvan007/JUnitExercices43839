import org.example.ShoppingCart.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProduCtTest
{
    @ParameterizedTest
    @CsvSource(value={"Product A, 10.0", "Product B, 20.0",
            "Product C, 30.0",
            "Other Product, 40.0"
    })
    public void testEqualsMethodTrue(String title, double price)
    {
        Product product = new Product(title, price);
        Product otherProduct = new Product(title, price);
        boolean expected = true;
        boolean actual = product.equals(otherProduct);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value={"Product A, 10.0", "Product B, 20.0",
            "Product C, 30.0",
            "Other Product, 40.0"
    })
    public void testEqualsMethodFalse(String title, double price)
    {
        Product product = new Product(title, price);
        Product otherProduct = new Product("Not Product", 2);
        boolean expected = false;
        boolean actual = product.equals(otherProduct);
        Assertions.assertEquals(expected, actual);
    }
}
