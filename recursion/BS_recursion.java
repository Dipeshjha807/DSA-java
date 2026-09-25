public class BS_recursion {

    static int solve(int[] arr,int target,int s,int e){
        if(s>e){
            return -1;
        }
        //bs logic
        int mid=s+(e-s)/2;
        if(arr[mid]==target){
            return mid;

        }
        if(arr[mid]>target){
            e=mid-1;
        }
        else{
            s=mid+1;
        }
        /// recursive calls
        int ans =solve(arr, target, s, e);
        return ans;

    }
    
  
    
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int target=2;
            int s=0;
    int e=arr.length-1;

         int ans= solve(arr,target,s,e);
System.out.println(ans);
    }
}
