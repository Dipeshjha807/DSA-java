public class solid_diamond {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {

            // for each row there is variable columns
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }



        
        // part 2: inverted pyramid
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                continue;
            }
            // for each row variable columns
            // fpr spaces
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("  ");
            }
            /// for stars
            for (int j = 1; j <= 2 * n - 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
