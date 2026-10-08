import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combuinationSUM {

 public static void solve(int[] candidates, int target, int index, List<Integer> output, List<List<Integer>> ans) {
        // Base Case: Target mil gaya
        if (target == 0) {
            ans.add(new ArrayList<>(output));
            return;
        }

        // Loop chalega current index se aage tak
        for (int i = index; i < candidates.length; i++) {
            // Duplicate check (Same level par pichhla element skip karo)
            if (i > index && candidates[i] == candidates[i - 1]) {
                continue;
            }
            
            // Agar element target se bada hai, toh aage ke saare bade honge (kyunki sorted hai)
            if (candidates[i] > target) {
                break;
            }

            // 1. INCLUDE
            output.add(candidates[i]);
            
            // 2. RECURSION (Agli position 'i + 1' bhejo, 'index + 1' nahi!)
            solve(candidates, target - candidates[i], i + 1, output, ans);
            
            // 3. BACKTRACK (Eraser)
            output.remove(output.size() - 1);
        }
    }


    public static void main(String[] args) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output= new ArrayList<>();
        int candidates[] = {10,1,2,7,6,1,5};    
        int target = 8;
        // Duplicates hatane ke liye sort karna zaroori hai
        Arrays.sort(candidates);
        
        solve(candidates, target, 0, output, ans);
        System.out.println(ans);
    }
}
