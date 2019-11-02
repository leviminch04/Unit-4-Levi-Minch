public class Movie {
    String title = "";
    String director = "";

    public Movie(String addTitle, String addDirector) {
        title += addTitle;
        director += addDirector;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public void setTitle(String newTitle) {
        title = newTitle;
    }

    public void setDirector(String newDirector) {
        director = newDirector;
    }
}