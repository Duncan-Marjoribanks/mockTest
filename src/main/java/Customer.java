public class Customer {

    private boolean hasLoyaltyCard;

    public Customer(boolean hasLoyaltyCard) {
        this.hasLoyaltyCard = hasLoyaltyCard;
    }

    public boolean checkIfLoyalty() {
        return this.hasLoyaltyCard;
    }
}
