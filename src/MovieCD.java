public class MovieCD extends CD {
    private String director;
    private String dub;

    public MovieCD(String name, String itemId, double price, String description, int length, String director, String dub) {
        super(name, itemId, price, description, length);
        this.director = director;
        this.dub = dub;
    }

    public String getDirector() {
        return director;
    }

    public String getDub() {
        return dub;
    }

    @Override
    public String toString() {
        return "MovieCD{" +
                "name='" + getName() + "'" +
                ", price='" + getPrice() + "'" +
                ", itemId='" + getItemId() + "'" +
                ", description='" + getDescription() + "'" +
                ", length='" + getLength() + "'" +
                ", director='" + director + '\'' +
                ", dub='" + dub + '\'' +
                '}';
    }
}
