import java.util.Scanner;

public class InputReader
{
    private Scanner scanner;

    public InputReader()
    {
        this.scanner = new Scanner(System.in);
    }

    public String getInput()
    {
        String input = scanner.nextLine();

        return input;

    }


}