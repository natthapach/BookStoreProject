public class MusicCD extends CD {
    private int musicAmount;
    private String musicName;
    private String singer;

    public MusicCD(String name, String itemId, double price, String description, int length, int musicAmount, String musicName, String singer) {
        super(name, itemId, price, description, length);
        this.musicAmount = musicAmount;
        this.musicName = musicName;
        this.singer = singer;
    }

    public int getMusicAmount() {
        return musicAmount;
    }

    public String getMusicName() {
        return musicName;
    }

    public String getSinger() {
        return singer;
    }

    @Override
    public String toString() {
        return "MusicCD{" +
                "name='" + getName() + "'" +
                ", price='" + getPrice() + "'" +
                ", itemId='" + getItemId() + "'" +
                ", description='" + getDescription() + "'" +
                ", length='" + getLength() + "'" +
                ", musicAmount=" + musicAmount +
                ", musicName='" + musicName + '\'' +
                ", singer='" + singer + '\'' +
                '}';
    }
}
