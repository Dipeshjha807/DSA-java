public class Book_Allocation {
    public static void main(String[] args) {
        // 1. Yahan apna array aur students (k) define karo
        int[] arr = { 12, 34, 67, 90 };
        int k = 2;

        // 2. Method call karke answer print karo
        int result = findpages(arr, k);
        System.out.println("Minimum Maximum Pages: " + result);
    }

    static boolean isvalidanswer(int arr[], int k, int maxpages) {
        int studentcount = 1;
        int pages = 0;
        for (int i = 0; i < arr.length; i++) {
            if (pages + arr[i] <= maxpages) {
                pages = pages + arr[i];
            } else {
                studentcount++;
                if (studentcount > k || arr[i] > maxpages) {
                    return false;
                } else {
                    pages = 0;
                    pages = pages + arr[i];
                }
            }
        }
        return true;
    }

    // Isko static bana diya taaki main method se direct call ho sake
    public static int findpages(int[] arr, int k) {
        int n = arr.length;
        
        // Edge case: agar students books se zyada hain
        if (n < k) {
            return -1;
        }

        int start = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > start) {
                start = arr[i]; // start ko max single element par set kiya
            }
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        
        int end = sum; // sum nikalne ke baad end assign kiya
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isvalidanswer(arr, k, mid)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans; // return statement while loop ke bahar hai
    }
}