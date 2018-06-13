import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BasketTest {

    Basket basket;
    Item item;

    @Before
    public void before() {
        basket = new Basket();
        item = new Item("thing", 50.00);
    }

    @Test
    public void canCountBasket() {
        assertEquals(0, basket.countItems());
    }

    @Test
    public void canAddItem() {
        basket.addItem(item);
        assertEquals(1, basket.countItems());
    }

    @Test
    public void canremoveItem() {
        basket.addItem(item);
        basket.removeItem(item);
        assertEquals(0, basket.countItems());
    }

    @Test
    public void canClearBasket() {
        basket.addItem(item);
        basket.addItem(item);
        basket.clearItems();
        assertEquals(0, basket.countItems());
    }

    @Test
    public void canGetTotalCostOfAllItems() {
        basket.addItem(item);
        basket.addItem(item);
        basket.updateTotalCost();
        assertEquals(90.00, basket.getTotalCost(), 0.01);
    }

    @Test
    public void canCountNumberOfSameItems() {
        basket.addItem(item);
        basket.addItem(item);
        basket.updateTotalCost();
        assertEquals(2, basket.countSpecificItems(item));
    }

    @Test
    public void canUpdateTotalCost() {
        basket.addItem(item);
        assertEquals(45.00, basket.getTotalCost(), 0.01);
        basket.clearItems();
        assertEquals(0.00, basket.getTotalCost(), 0.01);
    }

    @Test
    public void canApplyBogofDiscount() {
        basket.addItem(item);
        basket.addItem(item);
        basket.addItem(item);
        basket.addItem(item);
        basket.addItem(item);
        basket.addBogofDiscount(item);
        assertEquals(135.00, basket.getTotalCost(), 0.01);
    }

    @Test
    public void canDiscountByPercentageAfterBogofDiscountApplied() {
        basket.addItem(item);
        basket.addItem(item);
        basket.addItem(item);
        basket.addItem(item);
        basket.addItem(item);
        basket.addBogofDiscount(item);
        assertEquals(135.00, basket.getTotalCost(), 0.01);
    }


}
