@ -0,0 +1,51 @@
import java.util.Random;
import java.util.Scanner;  

public class GuessANumber {
    private static int rnd_number;

    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println( "I'm thinking of a number between 1 and 100 (including both).");
        System.out.println( "Can you guess what it is?...");
        makeAGuess();
    }


    private static void makeAGuess(){

        Scanner scanner = new Scanner(System.in);
        
        if(scanner.hasNextDouble()){

            double input = scanner.nextDouble();
            if(input == rnd_number){

                System.out.println("Congrats u guessed the number!!");
            }

            else if(input != rnd_number){

                if(input < rnd_number){
                    System.out.println("Your guess was lower than the target number. Try again!");
                    makeAGuess();
                }

                if(input > rnd_number){

                    System.out.println("Your guess was higher than the target number. Try again!");
                    makeAGuess();
                }
            }

        }
        else {
            System.out.println("input was not numeric. Try again");
            makeAGuess();
        }

    }
   
}