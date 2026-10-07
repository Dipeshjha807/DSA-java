import java.util.ArrayList; // <-- Yeh import zaroori hai!
import java.util.List;

public class subsetLC78 {

    
static void solve(int[] nums,int index ,List<List<Integer>> ans,List<Integer>output ){
    if(index>=nums.length){
        /// subsequense ready he = subsequece output wala list me banaya he 
        ans.add(new ArrayList<>(output));
        return;

    }
    // curent value ko me include krna chata hu jo ki mere  INDEX pe  bathi hui he usilie aisa index pe save kr dia 
    int current=nums[index];
//include
output.add(current);
    solve(nums,index+1,ans,output);

    //backktracking 
    output.remove(output.size()-1);
   // exclude
   solve(nums,index+1,ans,output);
}
    public static void main(String[] args) {
        int[] nums={1,2,3};
         List<List<Integer>> ans=new ArrayList<>();
                List<Integer> output=new ArrayList<>();
                int index =0;
               solve(nums , index,ans , output);
               System.out.println(ans);
    }
}
