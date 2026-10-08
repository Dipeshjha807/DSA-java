import java.util.ArrayList;
import java.util.List;

public class combinationSUM {
    
    
     public static void solve (int[] candidates, int target,int index,List<Integer> output, List<List<Integer>> ans ){
   if (target == 0) {
            ans.add(new ArrayList<>(output)); // Photocopy karke save kar liya
            return;
        }
        if(target <0 || index>=candidates.length){
            return;
        }

       /// utput me current no ko add kr dia 
        output.add(candidates[index]);

        // kuyu ki include kia he to target me se curewent no minus hopna chaia 
        // index +1 is lie hi kie kyu ki same no multiple time chl skta he is lie 
        solve (candidates,target-candidates[index],index,output,ans);
// backtract krn mtlb sunsqequence with sun k ya all subsequence print krne wala jo tga usme humra output ko wopis ane time phle jaisa a krna  padega 
output.remove(output.size() - 1);
// age pr jao curewnt ko chod do
        solve(candidates, target, index + 1, output, ans);

    }
    
    public static void main(String[] args) {
          List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
       int target=7;
       int[] candidates={2,2,3,7};
        int index =0;
      solve(candidates,target,index,output, ans);
        System.out.println(ans);
    }
}
