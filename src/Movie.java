public class Movie extends MediaItem {
    private String title;
    private String director;

    public Movie(String title, String director) {
        this.title = title;
        this.director = director;
    }

    public void printInfo() {
        System.out.println("Movie: " + title + " directed by " + director);
    }
}
