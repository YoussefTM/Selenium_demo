package productselectTest;

import Page.ProductSelection;
import org.testng.annotations.Test;

public class ProductSelectTest {

    final ProductSelection productselection = new ProductSelection();

    @Test
    public void SelectProduct(){
        productselection.ProductSelect();
    }

}
