public class Item {
    private String name;
    private String itemId;
    private double price;
    private String description;

    public Item(String name, String itemId, double price, String description) {
        this.name = name;
        this.itemId = itemId;
        this.price = price;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getItemId() {
        return itemId;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}
