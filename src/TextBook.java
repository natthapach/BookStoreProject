public class TextBook extends Book {
    private String subjects;

    public TextBook(String name, String itemId, double price, String description, String publisher, String isbn, int publishedYear, int publishedMonth, String author, String subjects) {
        super(name, itemId, price, description, publisher, isbn, publishedYear, publishedMonth, author);
        this.subjects = subjects;
    }

    public String getSubjects() {
        return subjects;
    }
}
