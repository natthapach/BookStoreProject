public class Main {
    public static void main(String[] args) {
        Magazine magazine = new Magazine("Hot Issue", "B-27839", 25, "-", "ABC", "978-3-16-148410-0", 2017, 12, "John Cena", "weekly");
        Novel novel = new Novel("Oh my General", "B-79420", 300, "-", "Jamsai", "499-3-59-398503-2", 2015, 11, "Lee sung", 3, "romantic");
        Cartoon cartoon = new Cartoon("Soma", "B-38940", 79, "-", "Mangnga", "299-9-58-938745-1", 2016, 8, "Aoyama Gocho", 3, "commady", "Oda narimasa");
        Handbook handbook = new Handbook("Thailand Travel", "B-47920", 189, "-","Sataporn" , "290-5-23-844784-3", 2013, 5, "winai jamsai", "travel");
        TextBook textBook = new TextBook("Statistic", "B-48373", 589, "-", "Oxford", "390-1-39-387493-1", 2013, 6, "scoth banner", "Mathematic");
        MovieCD movieCD = new MovieCD("Thor: Ragnarok", "MC-39402", 800, "-", 130, "Taika Waititi", "English");
        MusicCD musicCD = new MusicCD("Koisuru Fortune Cookie", "MC-39201", 400, "-", 4, 1, "Koisuru Fortune Cookie", "BNK48");
        Pen pen = new Pen("Lenser Spiral 825", "S-10293", 5, "-", "Lenser", "ballpoint pen", "Blue", "Blue");
        Pencil pencil = new Pencil("rotring 300", "S-93940", 130, "-", "rotring", "Clutch-type pencil", "red", "2B");
        Ruler ruler = new Ruler("BaiPoo 40 inches", "S-49503", 120, "-", "BaiPoo", "Rorler", "gray", 40);
        Notebook notebook = new Notebook("Double A Professional", "S-39450", 13, "-", "Double A", "Note Book", "Blue", 70, true, 16, 23);
        Food snack = new Food("Lay tomato", "F-09643", 30, "-", "03-04-2016", "03-04-2018", 50);

        BookStore bookStore = new BookStore();
        bookStore.addItem(magazine);
        bookStore.addItem(novel);
        bookStore.addItem(cartoon);
        bookStore.addItem(handbook);
        bookStore.addItem(textBook);
        bookStore.addItem(movieCD);
        bookStore.addItem(musicCD);
        bookStore.addItem(pen);
        bookStore.addItem(pencil);
        bookStore.addItem(ruler);
        bookStore.addItem(notebook);
        bookStore.addItem(snack);

        System.out.println("----------Item List----------");
        for(Item i : bookStore.getItems()){
            System.out.println(i.toString());
            System.out.println("------------------------------------------------------------------------------");
        }

    }
}
