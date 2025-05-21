public class Book extends MediaItem {
    private String author;

    public Book(String title, String author) {
        super(title);
        this.author = author;
    }

    public void printInfo() {
        printTitle();
        System.out.println("Author: " + author);
    }
}
