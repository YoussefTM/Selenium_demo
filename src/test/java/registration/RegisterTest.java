package registration;

import Page.Registration;
import org.testng.annotations.Test;

public class RegisterTest {

    final Registration registration = new Registration();

    @org.testng.annotations.Test(priority = 1)
    public void RegistrationSuccessfully(){
        registration.Register();

    }
}
