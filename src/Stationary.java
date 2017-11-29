public class Stationary extends Item {
    private String brand;
    private String type;
    private String color;

    public Stationary(String name, String itemId, double price, String description, String brand, String type, String color) {
        super(name, itemId, price, description);
        this.brand = brand;
        this.type = type;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }
}
