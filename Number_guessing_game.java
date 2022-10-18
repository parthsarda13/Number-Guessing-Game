import java.util.Random;
import java.util.Scanner;

public class Number_guessing_game {
    public static void main(String[] args) {
        Random rand = new Random();
        int rand_number = rand.nextInt(100);
        // System.out.println(rand_number);
        System.out.println("         Welcome to Number Guessing Game!      ");
        System.out.println("You have to predict the unknown number between 0 to 100");
        System.out.println("You have 5 chances to guess the number!");
        int chances = 5;
        Scanner sc = new Scanner(System.in);

        while (chances > 0) {

            System.out.println("Choose the number : ");
            int choice = sc.nextInt();
           // System.out.println(choice);

            if (choice < rand_number) {

                System.out.println(
                        "The number you chose is less than the unknown number, Please choose a greater number ");
                chances--;
                System.out.println("Number of chances left are : " + chances);
            }

            else if (choice > rand_number) {
                System.out.println(
                        "The number you chose is greater than the unknown number, Please choose a lesser number ");
                chances--;
                System.out.println("Number of chances left are : " + chances);

            } else {
                System.out.println("Congratulations, You guessed the number correct!!!");
                break;
            }
        }
        sc.close();

    }
}
