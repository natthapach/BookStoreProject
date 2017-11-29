public class Book extends Item{
    private String publisher;
    private String isbn;
    private int publishedYear;
    private int publishedMonth;
    private String author;

    public Book(String name, String itemId, double price, String description, String publisher, String isbn, int publishedYear, int publishedMonth, String author) {
        super(name, itemId, price, description);
        this.publisher = publisher;
        this.isbn = isbn;
        this.publishedYear = publishedYear;
        this.publishedMonth = publishedMonth;
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public int getPublishedMonth() {
        return publishedMonth;
    }

    public String getAuthor() {
        return author;
    }
}
