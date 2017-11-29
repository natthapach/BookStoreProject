public class Notebook extends Stationary {
    private int paperAmount;
    private boolean line;
    private double height;
    private double width;

    public Notebook(String name, String itemId, double price, String description, String brand, String type, String color, int paperAmount, boolean line, double height, double width) {
        super(name, itemId, price, description, brand, type, color);
        this.paperAmount = paperAmount;
        this.line = line;
        this.height = height;
        this.width = width;
    }

    public int getPaperAmount() {
        return paperAmount;
    }

    public boolean isLine() {
        return line;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
}
