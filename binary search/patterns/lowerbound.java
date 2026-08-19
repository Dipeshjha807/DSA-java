public class lowerbound {
    
    public static void main(String[] args) {
int[] arr={1,2,2,3,4,5,6,7};
int n=arr.length;
int target=2;
int start=0;
int end=n-1;
 while(start<=end){
    int mid=start+(end-start)/2;
    if (arr[mid]>=target){
   int ans=mid;
      // move to left to find the first occurrence
      end=mid-1;

    }
    else{
        start=mid+1;
    }
 }
 System.out.println("Lower bound index of " + target + " is: " + start);   ///Jahan search khatam hone ke baad pehla possible answer milega, us position par start ruk jayega."
    

}}
