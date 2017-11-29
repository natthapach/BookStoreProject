public class Ruler extends Stationary {
    private int length;

    public Ruler(String name, String itemId, double price, String description, String brand, String type, String color, int length) {
        super(name, itemId, price, description, brand, type, color);
        this.length = length;
    }

    public int getLength() {
        return length;
    }
}
