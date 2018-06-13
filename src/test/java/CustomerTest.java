import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CustomerTest {

    Customer customer, customer2;
    Basket basket;
    Item item, item2;

    @Before
    public void before() {
        customer = new Customer(false);
        customer2 = new Customer(true);
        basket = new Basket();
        item = new Item("item", 50.00);
        item2 = new Item("item2", 10.00);
    }

    @Test
    public void canCheckIfHasLoyaltyCard() {
        assertEquals(false, customer.checkIfLoyalty());
        assertEquals(true, customer2.checkIfLoyalty());
    }





}
