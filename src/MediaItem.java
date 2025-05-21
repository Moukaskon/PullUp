public abstract class MediaItem {
    protected String title;

    public MediaItem(String title) {
        this.title = title;
    }

    public void printTitle() {
        System.out.println("Title: " + title);
    }
}
