import java.util.List;
import java.util.Arrays;
// leetcode 120
public class TriangleS {

    // Yeh raha tera main solve function
    public static int solve(List<List<Integer>> triangle, int row, int col) {
        if (row == triangle.size()) {
            return 0;
        }
        
        int samerow = solve(triangle, row + 1, col);
        int difrow = solve(triangle, row + 1, col+ 1);
        int ansd = Math.min(samerow, difrow);

        return triangle.get(row).get(col) + ansd;  ///.get(row).get(col)= iskq mtlbv he ki hum sourse pe jo khade he wo ans dega mtlb jaise ki 2 start row he wo  uska dega aisa he 
    }

    public static void main(String[] args) {
        List<List<Integer>> triangle = Arrays.asList(
            Arrays.asList(2),
            Arrays.asList(3, 4),
            Arrays.asList(6, 5, 7),
            Arrays.asList(4, 1, 8, 3)
        );

        // Seedha main ke andar solve ko bula liya!
        int ans = solve(triangle, 0, 0);
        
        System.out.println("Answer: " + ans); 
        // Output: 11
    }
}