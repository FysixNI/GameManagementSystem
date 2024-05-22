public class Game
{
    private String title;
    private Genre genre;
    private int releaseYear;
    private String displayDetails;

    /**
     * This constructs a movie object
     * @param aTitle the title of the game
     * @param aGenre the genre of the game
     * @param aReleaseYear the release year of the game
     * @param aDisplayDetails shows the releaseYear, Title, Genre and displayDetails
     */

    public Game(String aTitle, Genre aGenre, int aReleaseYear, String aDisplayDetails)
    {
        this.title = aTitle;
        this.genre = aGenre;
        this.releaseYear = aReleaseYear;
        this.displayDetails = aDisplayDetails;
    }

    public Genre getGenre()
    {
        return genre;
    }

    public String getTitle()
    {
        return title;
    }

    public int getReleaseYear()
    {
        return releaseYear;
    }

    public String getDisplayDetails()
    {
        return displayDetails;
    }

    public void showInfo()
    {
        String gameInfo = this.getTitle() + ", " + this.getGenre() + " -running time: " + this.getReleaseYear() + " Year" + this.getDisplayDetails(); // need to add code to (getDisplayDetails)

        System.out.println(gameInfo);
    }

}
