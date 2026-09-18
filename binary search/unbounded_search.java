/// SEARCH A ELEMENT IN A UNBOUNDED ARRAY using BS so we can use exponentiaol search for finding the range i.e srart and end 


public class unbounded_search {


    public static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid; // Target mil gaya
            } else if (arr[mid] < target) {
                start = mid + 1; 
            } else {
                end = mid - 1;   
            }
        }
        return -1; 
    }

    public static int exponentialSearch(int[] arr, int target) {
        // Agar pehla element hi target hai
        if (arr[0] == target) {
            return 0;
        }

        int start = 0;
        int end = 1;

        while (end < arr.length && arr[end] < target) {
            start = end;         /// jo purana end he usko  naya start kr do 
            end = end * 2;      /// abd new end X2 hoga Yahi wo "exponential jump" hai!
        }

        if (end >= arr.length) {  // kbhui kbhi jump krne time end jo he wo array ke inderx se bahar chle jata he to usko rok ko aur arry he length ke ander la to i.e arr.length-1
            end = arr.length - 1;
        }

        return binarySearch(arr, target, start, end);
    }
public static void main(String[] args) {
    int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;

        int result = exponentialSearch(arr, target);
        System.out.println("Target ka index hai: " + result);

}    
}

/*start = 0, end = 1. (arr[1] ki value 5 hai, jo 90 se choti hai).

Loop 1:

start = 1

end = 1 * 2 = 2 (arr[2] par 7 hai, jo 90 se choti hai).

Loop 2:

start = 2

end = 2 * 2 = 4 (arr[4] par 10 hai, jo 90 se choti hai).

Loop 3:

start = 4

end = 4 * 2 = 8 (Yahan end array ki length yani 7 se bada ho gaya!).

if condition chali: end array ke baahar ja raha tha, toh usko pakad kar arr.length - 1 (yani index 6) par rok diya. */
