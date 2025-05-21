public class Movie extends MediaItem {
    private String director;

    public Movie(String title, String director) {
        super(title);
        this.director = director;
    }

    public void printInfo() {
        printTitle();
        System.out.println("Director: " + director);
    }
}
