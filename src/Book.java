public class Book extends MediaItem {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void printInfo() {
        System.out.println("Book: " + title + " by " + author);
    }
}
