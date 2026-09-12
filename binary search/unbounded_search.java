/// SEARCH A ELEMENT IN A UNBOUNDED ARRAY using BS so we can use exponentiaol search for finding the range i.e srart and end 


public class unbounded_search {


    public static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid; // Target mil gaya
            } else if (arr[mid] < target) {
                start = mid + 1; // Target bada hai, right jao
            } else {
                end = mid - 1;   // Target chhota hai, left jao
            }
        }
        return -1; // Nahi mila
    }

    // Exponential Search jo range (`start` aur `end`) dhoondta hai
    public static int exponentialSearch(int[] arr, int target) {
        // Agar pehla element hi target hai
        if (arr[0] == target) {
            return 0;
        }

        // 1. Pehle range dhoondo (Exponentially badha kar)
        int start = 0;
        int end = 1;

        // Jab tak 'end' array ke andar hai aur wahan ka element target se chhota hai
        while (end < arr.length && arr[end] < target) {
            start = end;       // Purana end ab start ban jayega
            end = end * 2;     // End ko double kar do (exponential jump)
        }

        // Agar 'end' array ki limit se bahar nikal gaya, toh usko array ke aakhri index par rok do
        if (end >= arr.length) {
            end = arr.length - 1;
        }

        // 2. Ab jo choti range mili (`start` se `end`), uske beech Binary Search chala do
        return binarySearch(arr, target, start, end);
    }
public static void main(String[] args) {
    int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;

        int result = exponentialSearch(arr, target);
        System.out.println("Target ka index hai: " + result);

}    
}
