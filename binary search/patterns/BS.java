public class BS {
        public static void main(String[] args) {
            int[] arr = { 2, 3, 4, 10, 40 };
            int target = 10;
            int start = 0;
            int end = arr.length - 1;
            while(start<end){
                int mid=start+(end-start)/2;
                if(arr[mid]==target){
                    System.out.println(mid);
                    break;
                }
                else if(arr[mid]<target){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }

            }
        
        }
}
