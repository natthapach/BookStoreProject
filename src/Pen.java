public class Pen extends Stationary {
    private String inkColor;

    public Pen(String name, String itemId, double price, String description, String brand, String type, String color, String inkColor) {
        super(name, itemId, price, description, brand, type, color);
        this.inkColor = inkColor;
    }

    public String getInkColor() {
        return inkColor;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "name='" + getName() + "'" +
                ", price='" + getPrice() + "'" +
                ", itemId='" + getItemId() + "'" +
                ", description='" + getDescription() + "'" +
                ", brand='" + getBrand() + "'" +
                ", type='" + getType() + "'" +
                ", color='" + getColor() + "'" +
                ", inkColor='" + inkColor + '\'' +
                '}';
    }
}
