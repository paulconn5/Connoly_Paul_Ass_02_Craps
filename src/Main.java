import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();
        String p1;
        int dice1;
        int dice2;
        int diceCombined;
        int lastRoll;
        boolean done = false;

        do {

            dice1 = rnd.nextInt(7);
            dice2 = rnd.nextInt(7);
            diceCombined = dice1+dice2;

            if (diceCombined == 2 || diceCombined == 3 || diceCombined == 12) {
                System.out.println("Crap! You lose by rolling " + diceCombined);
            } else if (diceCombined == 7) {
                System.out.println("You win by rolling a 7!");
            }
            else {
                System.out.println("You rolled a " + diceCombined + " which is now the point.");
                boolean finish = false;
                lastRoll = diceCombined;
                do {
                    dice1 = rnd.nextInt(7);
                    dice2 = rnd.nextInt(7);
                    diceCombined = dice1 + dice2;
                    if (diceCombined == 7) {
                        System.out.println("You rolled a 7, you lose!");
                        finish = true;
                    } else if (diceCombined == lastRoll) {
                        System.out.println("You win by rolling the point " + lastRoll);
                        finish = true;
                    } else {
                        System.out.println("You rolled a " + diceCombined + ", so rolling again...");
                    }

                } while (!finish);


                System.out.println("Play again? [Y/N]");
                p1 = scan.nextLine();
                if (p1.equalsIgnoreCase("N")) {
                    done = true;
                }
            }

        } while(!done);
    }
}