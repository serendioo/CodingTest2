import java.util.Random;
import java.util.Scanner;

public class LogicGames {
    public void logic() {
        int playerScore = 0;
        int computerScore = 0;


        Scanner read = new Scanner(System.in);
        Random rn = new Random();

        for (int i = 0; i < 3; i++) {

            int nearestPointPlayer = 0;
            int nearestPointComputer = 0;

            System.out.println("==============");
            System.out.println("Round " + (i+1));

            System.out.println("Input your number 0-9 :");
            int playerInput = read.nextInt();

            System.out.println("==============");
            int guestRandom = rn.nextInt(9 + 1);
            int randomComp = rn.nextInt(9 + 1);
            System.out.println("Guest Number is " + guestRandom);
            System.out.println("Computer input is " + randomComp);
            System.out.println("==============");

            if (playerInput < guestRandom) {
                for (int j = playerInput; j < guestRandom; j++) {
                    nearestPointPlayer++;
                }
                System.out.println("jarak angka player " + nearestPointPlayer);
            } else if (playerInput > guestRandom) {
                for (int j = guestRandom; j < playerInput; j++) {
                    nearestPointPlayer++;
                }
                System.out.println("jarak angka player " + nearestPointPlayer);

            }

            if (randomComp < guestRandom) {
                for (int j = randomComp; j < guestRandom; j++) {
                    nearestPointComputer++;
                }
                System.out.println("jarak angka Computer " + nearestPointComputer);


            } else if (randomComp > guestRandom) {
                for (int j = guestRandom; j < randomComp; j++) {
                    nearestPointComputer++;
                }
                System.out.println("jarak angka computer " + nearestPointComputer);
            }

            if (nearestPointPlayer == nearestPointComputer) {
                System.out.println("Draw");
            } else if (nearestPointPlayer > nearestPointComputer) {
                computerScore++;
            } else if (nearestPointPlayer < nearestPointComputer) {
                playerScore++;
            }

            System.out.println("===============");
            System.out.println("Player Score = "+ playerScore);
            System.out.println("Computer Score = "+ computerScore);
            System.out.println("===============");
        }



        if (playerScore == computerScore) {
            System.out.println("Draw");

        } else if (playerScore > computerScore) {
            System.out.println("Player win");

        } else if (playerScore < computerScore) {
            System.out.println("Computer win");
        }
    }
}
