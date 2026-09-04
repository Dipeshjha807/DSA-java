public class aggressive_cows {

    static boolean isvalid(int[] arr, int k, int mindistance) {

        int cowcount = 1;
        int lastposition = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] - arr[lastposition] >= mindistance) {
                cowcount++;
                lastposition = i;
                if (cowcount == k) {
                    return true;
                }
            }

        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 8, 9 };
        int k = 3;   /// no of cows
        int start = 0;
        int n = arr.length;
        int end = arr[n - 1] - arr[0];
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (isvalid(arr, k, mid)) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println(ans);
    }
}
