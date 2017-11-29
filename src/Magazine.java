public class Magazine extends Book {
    private String issueDate;

    public Magazine(String name, String itemId, double price, String description, String publisher, String isbn, int publishedYear, int publishedMonth, String author, String issueDate) {
        super(name, itemId, price, description, publisher, isbn, publishedYear, publishedMonth, author);
        this.issueDate = issueDate;
    }

    public String getIssueDate() {
        return issueDate;
    }
}
