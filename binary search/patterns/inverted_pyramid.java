public class inverted_pyramid {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {

            // for each row variable columns 
   //fpr spaces
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("  ");
            }
            ///for stars
            for (int j = 1; j <= 2 * n - 2*i-1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
