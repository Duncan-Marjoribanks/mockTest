public class Customer {

    private boolean hasLoyaltyCard;
    public Basket basket;

    public Customer(boolean hasLoyaltyCard) {
        this.hasLoyaltyCard = hasLoyaltyCard;
        this.basket = new Basket();
    }

    public boolean checkIfLoyalty() {
        return this.hasLoyaltyCard;
    }

    public double getTotalCostOfBasket() {
        if (this.hasLoyaltyCard) {
            this.basket.applyDiscount(2 );
        }
        return basket.getTotalCost();
    }

}
