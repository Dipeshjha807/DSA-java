
public class upperBound {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 60, 70 };
        int start = 0;
        int target = 25;
        int n = arr.length;
        int end = n - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] <= target) {
                start = mid + 1;
            } else {
                int ans = mid;
                end = mid - 1;
            }
        }
        System.out.println("Upper bound index of " + target + " is: " + start); /// Jahan search khatam hone ke baad
                                                                                /// pehla possible answer milega, us
                                                                                /// position par start ruk jayega."
    }
}

/*
 * LOWER BOUND → first >= target
 * 
 * UPPER BOUND → first > target
 */