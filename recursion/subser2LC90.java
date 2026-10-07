import java.util.List;
import java.util.ArrayList; // <-- Yeh import zaroori hai!

public class subser2LC90 {
    
    
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
   // while excluding ignorer te same element and move on the new element
   while(index+1<nums.length && nums[index]==nums[index+1]){
    index ++;
   }
   solve(nums,index+1,ans,output);
}
    
    public static void main(String[] args) {
        int[] nums={1,2,2};
         List<List<Integer>>  ans = new ArrayList<>();
        List<Integer> output = new ArrayList <>();
        int index =0;
        solve(nums ,index,ans,output);
        System.out.println(ans);
    }
}
