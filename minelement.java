public class minelement {
  
    public static void main(String[] args) {
        int[] arr={1,2,3,4,67,-1};
        int min=arr[0];
        for(int i=0; i< arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
                
            }
        }
        System.out.println("Minimum element in the array: " + min);
    }
}
