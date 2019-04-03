import Dealership.Person.Customer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    private Customer customer;

    @Before
    public void before() {
        customer = new Customer(" John", 300);
    }

    @Test
    public void setGetName() {
        customer.setName("Emil");
        assertEquals("Emil", customer.getName());
    }

    @Test
    public void setGetWallet() {
        customer.setWallet(500);
        assertEquals(500, customer.getWallet(),0);
    }

    @Test
    public void canBuyCar() {
        assertEquals(200, customer.buyCar(200), 0);
    }
}
