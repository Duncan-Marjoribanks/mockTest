import java.util.ArrayList;

public class Basket {

    private ArrayList<Item> contents;

    public Basket() {
        this.contents = new ArrayList <>();
    }

    public int countItems() {
        return this.contents.size();
    }

    public void addItem(Item item) {
        this.contents.add(item);
    }

    public void removeItem(Item item) {
        this.contents.remove(item);
    }
}
