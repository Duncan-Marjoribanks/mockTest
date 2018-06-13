import java.util.ArrayList;

public class Basket {

    private ArrayList<Item> contents;

    private double totalCost;

    public Basket() {
        this.contents = new ArrayList <>();
        this.totalCost = 0.00;
    }

    public int countItems() {
        return this.contents.size();
    }

    public void addItem(Item item) {
        this.contents.add(item);
        this.updateTotalCost();
    }

    public void removeItem(Item item) {
        this.contents.remove(item);
        this.updateTotalCost();
    }

    public void clearItems() {
        this.contents.clear();
        this.updateTotalCost();
    }

    public double getTotalCost() {
        return this.totalCost;
    }

    public int countSpecificItems(Item item) {
        int total = 0;
        for (Item itemToCheck : this.contents) {
            if (itemToCheck == item) {
                total++;
            }
        }
        return total;
    }

    public void addBogofDiscount(Item item) {
        this.updateTotalCost();
        int numberOfItem = this.countSpecificItems(item);
        if (numberOfItem % 2 == 0) {
            this.totalCost = this.totalCost - (0.5 * (item.getPrice() * numberOfItem));
            }
            else {
            this.totalCost -= ((item.getPrice() * (numberOfItem + 1)) / 2) - item.getPrice();
        }
    }

    public void updateTotalCost() {
        double amount = 0;
        for (Item item : this.contents) {
            amount += item.getPrice();
        }
        this.totalCost = this.totalCost + (amount - this.totalCost);
    }

    public void applyDiscount(int percentage) {
        this.totalCost = ((this.totalCost/100) * percentage);
    }

}
