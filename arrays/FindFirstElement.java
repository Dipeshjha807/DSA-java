public class FindFirstElement {

    // find the first unsorted array


 static int issorted(int[] arr){
       
        for (int i = 0; i <= arr.length; i++) {
            if (arr[i+1]<=arr[i]) {
              return arr[i+1];
            } 
        }
        return -1;
    }



    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4,  5, 6, 7, 8, 1 };
        System.out.println(issorted(arr));
      
       
}
}
