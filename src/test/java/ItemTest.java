import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ItemTest {

    Item item;

    @Before
    public void before() {
        item = new Item("item", 50.00);
    }

    @Test
    public void canGetName() {
        assertEquals("item", item.getName());
    }

    @Test
    public void canGetPrice() {
        assertEquals(50.00, item.getPrice());
    }

    @Test
    public void canSetPrice() {
        item.setPrice(25.00);
        assertEquals(25.00, item.getPrice());
    }

}
