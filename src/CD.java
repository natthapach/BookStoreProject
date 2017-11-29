public class CD extends Item{
    private int length;

    public CD(String name, String itemId, double price, String description, int length) {
        super(name, itemId, price, description);
        this.length = length;
    }

    public int getLength() {
        return length;
    }
}
