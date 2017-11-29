public class Pencil extends Stationary {
    private String depth;

    public Pencil(String name, String itemId, double price, String description, String brand, String type, String color, String depth) {
        super(name, itemId, price, description, brand, type, color);
        this.depth = depth;
    }

    public String getDepth() {
        return depth;
    }

    @Override
    public String toString() {
        return "Pencil{" +
                "name='" + getName() + "'" +
                ", price='" + getPrice() + "'" +
                ", itemId='" + getItemId() + "'" +
                ", description='" + getDescription() + "'" +
                ", brand='" + getBrand() + "'" +
                ", type='" + getType() + "'" +
                ", color='" + getColor() + "'" +
                ", depth='" + depth + '\'' +
                '}';
    }
}
