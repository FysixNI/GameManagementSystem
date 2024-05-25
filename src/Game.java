public class Game
{
    private String title;

    private Genre genre;

    private int releaseYear;

    public Game(String aTitle, Genre aGenre, int aReleaseYear)
    {
        this.title = aTitle;
        this.genre = aGenre;
        this.releaseYear = aReleaseYear;
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


    public void showInfo()
    {
        String gameInfo = this.getTitle() + ", " + this.getGenre() + " -running time: " + this.getReleaseYear() + " Year ";

        System.out.println(gameInfo);
    }
}