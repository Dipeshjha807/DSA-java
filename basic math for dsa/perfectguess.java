import java.util.Random;
import java.util.Scanner;

// a simple guess code it was not form any dsa question just for fun you can try this for you base knowledge of packages

public class perfectguess{
    public static void main(String[] args) {
        
        Random random=new Random();
        Scanner sc =new Scanner(System.in);

        int n=random.nextInt(101);
         int a = -1;
        int guesses = 0;

        while (a != n) {
            System.out.print("Guess a number between 1 and 100: ");
            a = sc.nextInt();
            guesses++;

            if (a > n) {
                System.out.println("Lower number please");
            } else if (a < n) {
                System.out.println("Higher number please");
            } else {
                System.out.println("You have guessed the number " + n +
                                   " correctly in " + guesses + " attempts!");
            }
        }

        sc.close();
    }
}