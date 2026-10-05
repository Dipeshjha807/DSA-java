import java.util.List;
import java.util.Arrays;

public class TriangleRecursive {

    // Recursive function
    public static int solve(List<List<Integer>> triangle, int row, int col) {
        // Base Case: Agar aakhiri row ke baad chale gaye
        if (row == triangle.size()) {
            return 0;
        }
        
        // Choice 1: Neeche same index par jao
        int samerow = solve(triangle, row + 1, col);
        
        // Choice 2: Neeche diagonal (col + 1) par jao
        int difrow = solve(triangle, row + 1, col + 1);
        
        // Dono rasto mein se minimum nikal lo
        int ansd = Math.min(samerow, difrow);

        // Current cell ki value + aage ke raste ka minimum jod kar return karo
        return triangle.get(row).get(col) + ansd;
    }

    public static int minimumTotal(List<List<Integer>> triangle) {
        return solve(triangle, 0, 0);
    }

    // VS Code mein run karne ke liye main method
    public static void main(String[] args) {
        // Sample Test Case (LeetCode 120 ka example)
        List<List<Integer>> triangle = Arrays.asList(
            Arrays.asList(2),
            Arrays.asList(3, 4),
            Arrays.asList(6, 5, 7),
            Arrays.asList(4, 1, 8, 3)
        );

        int ans = minimumTotal(triangle);
        System.out.println("Minimum Path Total: " + ans); 
        // Expected Output: 11 (2 -> 3 -> 5 -> 1)
    }
}