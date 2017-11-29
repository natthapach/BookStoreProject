public class Novel extends Book {
    private int bookNumber;
    private String genres;

    public Novel(String name, String itemId, double price, String description, String publisher, String isbn, int publishedYear, int publishedMonth, String author, int bookNumber, String genres) {
        super(name, itemId, price, description, publisher, isbn, publishedYear, publishedMonth, author);
        this.bookNumber = bookNumber;
        this.genres = genres;
    }

    public int getBookNumber() {
        return bookNumber;
    }

    public String getGenres() {
        return genres;
    }
}
