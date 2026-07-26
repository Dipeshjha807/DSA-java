public class palindrome {
    public static void main(String[] args) {
        int n = 1221;
        int rev = 0;

       int original = n;   // save original number
        while (n != 0) {
            int current = n % 10;
            rev = rev * 10 + current;
            n = n / 10;
        }
        if (original == rev) {
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }
    }
}