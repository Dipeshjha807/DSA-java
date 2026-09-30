public class lc416 {
    static boolean solve(int target ,int[]arr,int index){

        if(target==0){
            /// foundf one way to create trget
            return true;
        }
        if(target<0){
            return false;
        }
        if(index>=arr.length){
            return false;

        }
        boolean include=solve (target-arr[index],arr,index+1);
        boolean exclude=solve(target, arr, index + 1);
        return include||exclude;
    }
    
    public static void main(String[] args) {
     int [] arr ={1,1,2,3,4};
     int sum =0;
   for (int i =0 ;i<arr.length;i++){
    sum = sum +arr[i];
   } 
   
     int index  =0;
     int target=sum/2;
     boolean  ans = solve(target,arr , index);
     System.out.println( ans);
    }
}
