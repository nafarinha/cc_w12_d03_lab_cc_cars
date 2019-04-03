import Dealership.Person.Dealer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealerTest {


    private Dealer dealer;

    @Before
    public void before() {
        dealer = new Dealer("Cull");
    }

    @Test
    public void setGetName() {
        dealer.setName("Sunny");
        assertEquals("Sunny", dealer.getName());
    }
}
