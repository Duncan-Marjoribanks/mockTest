import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CustomerTest {

    Customer customer1, customer2;
    Item item1, item2;

    @Before
    public void before() {
        customer1 = new Customer(false);
        customer2 = new Customer(true);
        item1 = new Item("item", 200.00);
        item2 = new Item("item2", 10.00);
    }

    @Test
    public void canCheckIfHasLoyaltyCard() {
        assertEquals(false, customer1.checkIfLoyalty());
        assertEquals(true, customer2.checkIfLoyalty());
    }

    @Test
    public void canAddItemsToCustomerBasket() {
        customer1.basket.addItem(item1);
        customer1.basket.finalizeTotal();
        assertEquals(1, customer1.basket.countItems());
    }

    @Test
    public void canDiscountForLoyaltyCard() {
        customer2.basket.addItem(item1);
        customer2.basket.finalizeTotal();
        assertEquals(176.40, customer2.getTotalCostOfBasket(), 0.01);
    }

}
