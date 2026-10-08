import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combuinationSUM2 {

 public static void solve(int[] candidates, int target, int index, List<Integer> output, List<List<Integer>> ans) {
        // Base Case: Target mil gaya
        if (target == 0) {
            ans.add(new ArrayList<>(output));
            return;
        }

        if(target <0 || index>=candidates.length){
            return;
        }
        output.add(candidates[index]);
        solve(candidates, target -candidates[index], index+1, output, ans);

        output.remove(output.size()-1);
        while(index+1 <candidates.length&& candidates[index]==candidates[index+1]){
            index ++;
        }

                solve(candidates, target, index+1, output, ans);

       
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
