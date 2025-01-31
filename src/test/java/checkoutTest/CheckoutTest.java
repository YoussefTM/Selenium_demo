package checkoutTest;

import Page.Checkout;
import org.testng.annotations.Test;

public class CheckoutTest {

    final Checkout checkout = new Checkout();

    @Test
    public void ProceedToCheckout(){
        checkout.CheckoutAndPayment();
    }
}
