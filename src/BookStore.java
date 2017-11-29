public class BookStore {
    private Item[] items = new Item[200];
    private int i = 0;

    public void addItem(Item item){
        items[i] = item;
        i += 1;
    }

    public void removeItem(Item item){
        items[i] = null;
        i -= 1;
    }

    public Item[] getItems() {
        return items;
    }
}
