public class Item {

    private String name;
    private double price;
    private boolean hasBogofDiscount;


    public Item(String name, double price, boolean hasBogofDiscount){
        this.name = name;
        this.price = price;
        this.hasBogofDiscount = false;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
    }

    public boolean getBogofDiscountStatus() {
        return this.hasBogofDiscount;
    }

    protected void setHasBogofDiscount() {
        this.hasBogofDiscount = true;
    }

    protected void setHasNotBogofDiscount() {
        this.hasBogofDiscount = false;
    }
}
