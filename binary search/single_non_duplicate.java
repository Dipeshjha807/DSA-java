// find the single  non duplicate element in a sorted array

public class single_non_duplicate {
    public static void main(String[] args) {
        int[] arr={10,10,20,20,30,40,40,50,50};
        int start=0;
        int end=arr.length-1;
 
        while(start<= end){
            int mid=start+(end-start)/2;


            //// to chck is arr[mid] is a valid ans or not so we can chekc 
            if(arr[mid]!=arr[mid-1]&&arr[mid]!=arr[mid+1]){
                System.out.println("Single non-duplicate element is: "+arr[mid]);
                return;
            }
            else if(arr[mid]==arr[mid-1]){
                
                if(mid%2==0){
                    end=mid-2;
                }
                else{
                    start=mid+1;
                }
            }
            else if(arr[mid]==arr[mid+1]){
                if(mid%2==0){
                    start=mid+2;
                }
                else{
                    end=mid-1;
                }
            }
        }
    }
    
}
