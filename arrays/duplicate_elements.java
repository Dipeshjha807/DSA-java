public class duplicate_elements {
    // remove duplicate elements from an array
    public static void main(String[] args) {    
        int[] arr = {1,1,1,2,2,3,4,5};

        int n = arr.length;
        int i=0;
        int j=1;
        while(j<n){
            if(arr[i] == arr[j]){
                j++;
            } else {
                //no match found, so we will move the unique element to the next position
                i++;
                arr[i] = arr[j];
                 j++;
            }
            
        }
         for(int k=0; k<=i; k++){
            System.out.print(arr[k] + " ");
        }
        
        
    }
}
