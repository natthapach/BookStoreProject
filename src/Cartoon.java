public class Cartoon extends Book {
    private int bookNumber;
    private String genres;
    private String painter;

    public Cartoon(String name, String itemId, double price, String description, String publisher, String isbn, int publishedYear, int publishedMonth, String author, int bookNumber, String genres, String painter) {
        super(name, itemId, price, description, publisher, isbn, publishedYear, publishedMonth, author);
        this.bookNumber = bookNumber;
        this.genres = genres;
        this.painter = painter;
    }

    public int getBookNumber() {
        return bookNumber;
    }

    public String getGenres() {
        return genres;
    }

    public String getPainter() {
        return painter;
    }

    @Override
    public String toString() {
        return "Cartoon{" +
                "name='" + getName() + "'" +
                ", price='" + getPrice() + "'" +
                ", itemId='" + getItemId() + "'" +
                ", description='" + getDescription() + "'" +
                ", isbn='" + getIsbn() + "'" +
                ", publisher=" + getPublisher() + "'" +
                ", publishedYear='" + getPublishedYear() + "'" +
                ", publishedMonth='" + getPublishedMonth() + "'" +
                ", author='" + getAuthor() + "'" +
                ", bookNumber=" + bookNumber +
                ", genres='" + genres + '\'' +
                ", painter='" + painter + '\'' +
                '}';
    }
}
