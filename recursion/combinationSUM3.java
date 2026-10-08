import java.util.List;
import java.util.ArrayList;

public class combinationSUM3 {
    
      public static void solve (int[] candidates,int target, List<List<Integer>> ans,List<Integer> output,int index,int count,int k){
         
         if(count>k)
         {
            return;
         }

   if (  count ==k && target == 0) {
            ans.add(new ArrayList<>(output)); // Photocopy karke save kar liya
            return;
        }

        
        if(target <0 || index>=candidates.length){
            return;
        }
        output.add(candidates[index]);
        solve(candidates, target -candidates[index],ans,output, index+1,count+1,k);

        output.remove(output.size()-1);
        while(index+1 <candidates.length&& candidates[index]==candidates[index+1]){
            index ++;
        }

                solve(candidates, target,ans,output, index+1,count,k);


    }
    
    
    public static void main(String[] args) {
           List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output= new ArrayList<>();
         int index =0;
         int[] candidates={1,2,3,4,5,6,7,8,9};
         int n=7;
         int target=n;
         int count =0;
         int k=3;
         solve(candidates,target,ans,output,index,count,k);
         System.out.println(ans);

    }
}
//Jaise agar question mein k = 3 diya hai, iska matlab hai ki warehouse (ans) mein jo bhi combination jayega, uske andar exact 3 numbers hone chahiye. (Na 3 se kam, na 3 se zyada).
//Jaise agar question mein n = 7 diya hai, iska matlab hai ki jo 3 numbers tune chune hain, unko aapas mein jodne par total 7 aana chahiye.


/*k = 3 ka matlab hai ki combination mein exact 3 numbers hone chahiye.

target = n = 7 ka matlab hai ki un 3 numbers ka total sum 7 hona chahiye. so the output is [[1, 2, 4]] */