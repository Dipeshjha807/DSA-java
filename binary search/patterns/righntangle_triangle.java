
public class righntangle_triangle {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row <= n; row++) {
            // for each row print variable cols
            // formula is col jyga 1-> value of row
            for (int j = 1; j <= row; j++) {
                System.out.print("*");
            }
            // move to next row for each row print variable cols
            System.out.println();
        }
    }

}

// jitna row no hoga utha hi stars print honge