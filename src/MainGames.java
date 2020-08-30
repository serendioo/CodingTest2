import java.util.Scanner;

public class MainGames {
    public static void main(String[] args) {

        String playerName;
        Scanner read = new Scanner(System.in);
        LogicGames logics = new LogicGames();

        System.out.println("Player name : ");
        playerName = read.next();

        logics.logic();

    }
}
