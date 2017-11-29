public class Handbook extends Book {
    private String category;

    public Handbook(String name, String itemId, double price, String description, String publisher, String isbn, int publishedYear, int publishedMonth, String author, String category) {
        super(name, itemId, price, description, publisher, isbn, publishedYear, publishedMonth, author);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Handbook{" +
                "name='" + getName() + "'" +
                ", price='" + getPrice() + "'" +
                ", itemId='" + getItemId() + "'" +
                ", description='" + getDescription() + "'" +
                ", isbn='" + getIsbn() + "'" +
                ", publisher=" + getPublisher() + "'" +
                ", publishedYear='" + getPublishedYear() + "'" +
                ", publishedMonth='" + getPublishedMonth() + "'" +
                ", author='" + getAuthor() + "'" +
                ", category='" + category + '\'' +
                '}';
    }
}
