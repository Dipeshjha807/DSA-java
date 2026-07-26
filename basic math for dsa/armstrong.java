import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the no :");
        int n = sc.nextInt();

        int sum = 0;
        int originalnum = n;

        while (n != 0) {
            int digit = n % 10;
            int cube = digit * digit * digit;
            sum = sum + cube;
            n = n / 10;
        }
        if (sum == originalnum) {
            System.out.println("the no is armstrong");
        } else {
            System.out.println("not armstrong");
        }
    }

}
