public class GameManagementSystem
{
    private InputReader reader;

    private GameCollection library;

    public GameManagementSystem()
    {
        this.reader = new InputReader();
        this.library = new GameCollection();
    }

    public void showMainMenu()
    {
        boolean quit = false;

        while (quit == false)
        {
            System.out.println("Please select an option: ");
            System.out.println("1. add a game");
            System.out.println("2. view all games");
            System.out.println("0. exit");

            String userInput = reader.getInput();

            switch (userInput)
            {
                case "1":
                    this.addGame();
                    break;
                case "2":
                    this.viewallGames();
                    break;
                case "0":
                    quit = true;
                    break;
                default:
                    System.out.println("That was not a valid option.");


            }
        }
    }

    public void addGame()
    {
        System.out.println("Please enter the title of the game: ");
        String title = reader.getInput();

        System.out.println("Please enter the release year of the game: ");
        String userInput = reader.getInput();
        int releaseYear = 0;

        System.out.println("Please enter the genre of the game: ");

        try
        {
            releaseYear = Integer.parseInt(userInput);
        }

        catch (NumberFormatException exception)
        {
            System.err.println("The input could not be parsed to an int.");
            return;
        }

        Genre aGenre;

        System.out.println("1. Action");
        System.out.println("2. Platform");
        System.out.println("3. Adventure");
        System.out.println("4. RPG");
        System.out.println("5. Strategy");

        userInput = reader.getInput();

        int genreNumber = -1;

        try
        {
            genreNumber = Integer.parseInt(userInput);
        }

        catch (NumberFormatException exception)
        {
            System.out.println("The input could not be parsed to an int.");
            return;
        }

        if( genreNumber < 1 || genreNumber > 6)
        {
            System.err.println("That was not a valid option.");
            return;
        }

        Genre genre = Genre.ACTION;

        switch (genreNumber)
        {
            case 1:
                genre = Genre.ACTION;
                break;
            case 2:
                genre = Genre.PLATFORM;
                break;
            case 3:
                genre = Genre.ADVENTURE;
                break;
            case 4:
                genre = Genre.RPG;
                break;
            case 5:
                genre = Genre.STRATEGY;
                break;
        }

        Game g = new Game(title, genre, releaseYear);
        this.library.addGame(g);
    }

    public void viewallGames()
    {
        this.library.showGames();
    }
}