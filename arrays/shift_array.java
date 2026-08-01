public class shift_array {
    public static void main(String[] args) {
        
         int[] arr={1,2,3,4,5};
         
         //step 1: store the last value
         int n=arr.length;
         int temp=arr[n-1];
         for(int i=n-1;i>0;i--){
             arr[i]=arr[i-1];
         }
        // step 2= shift all values fo the array
        arr[0]=temp;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
