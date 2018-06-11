import java.util.ArrayList;

public class Basket {

    private ArrayList<Item> contents;
    private double totalCost;

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

    public void clearItems() {
        this.contents.clear();
    }

    public double getTotalCost() {
//        int total = 0;
        totalCost = 0;
        for (Item item : this.contents) {
            totalCost += item.getPrice();
//            total += item.getPrice();
        }
        return totalCost;
//        return total;
    }

    public int countSpecificItems(Item item) {
        int total = 0;
        for (Item itemToCheck : this.contents) {
            if (itemToCheck == item) {
                total ++;
            }
        }
        return total;
    }

    public void addBogofDiscount(Item item) {
        if (this.countSpecificItems(item) % 2 == 0){
            item.setPrice(item.getPrice() * 0.5);
        }
        else {
            item.setPrice(item.getPrice() * 0.5);
            addItem(item);
        }
    }


}
