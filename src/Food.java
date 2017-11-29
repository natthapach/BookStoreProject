public class Food extends Item{
    private String manufactoredDate;
    private String expiredDate;
    private double amount;

    public Food(String name, String itemId, double price, String description, String manufactoredDate, String expiredDate, double amount) {
        super(name, itemId, price, description);
        this.manufactoredDate = manufactoredDate;
        this.expiredDate = expiredDate;
        this.amount = amount;
    }

    public String getManufactoredDate() {
        return manufactoredDate;
    }

    public String getExpiredDate() {
        return expiredDate;
    }

    public double getAmount() {
        return amount;
    }
}
