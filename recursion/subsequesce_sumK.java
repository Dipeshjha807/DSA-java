public class subsequesce_sumK {
    
    static boolean solve ( int[] arr ,int index,int sum , int target ){
      if(index>=arr.length){
        if(sum == target){
            return true;
        }
        else{
            return false;
        }

      }
      boolean include= solve (arr,index+1,sum +arr[index],target);
      boolean exclude= solve (arr,index+1,sum,target);
      return include || exclude;
    }
    
    
    public static void main(String[] args) {
        int index =0;
         int sum = 0;
         int target = 5;
         int[] arr = {1,2,3,4};

         boolean ans = solve(arr, index, sum, target);

           System.out.println(ans);
        }
}
