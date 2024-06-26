import java.util.ArrayList;

public class GameCollection
{
    private ArrayList<Game> games;

    public GameCollection()
    {
        this.games = new ArrayList<>();
    }

    public void addGame (Game g)
    {
        this.games.add(g);
    }

    public void showGames()
    {
        for(Game g : this.games)
        {
            g.showInfo();
        }
    }

    public int gameCount()
    {
        int count = this.games.size();

        return count;
    }
}