public class hollo_pyramid {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {

            // part 1: spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // part 2
            if (i == 1 || i == n) {
                for (int j = 1; j <= 2 * i - 1; j++) { /// for row 1 2*1-1=1, row 5 2*5-1=9
                    System.out.print("* ");
                }

            } else {
                // middile rows  phle ak star print kro, 
                System.out.print("* ");
         
         
                //then kuch spaces 2 * i - 3
                for (int j = 1; j <= 2 * i - 3; j++) {
                    System.out.print("  ");
                }
                // phir ak *
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
