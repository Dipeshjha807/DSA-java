public class almost_sortedArray {
    public static void main(String[] args) {
        int[] arr = { 10, 3, 40, 20, 50, 80, 70 };
        int target = 80;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // Check mid - 1 (Boundary safe rakhne ke liye mid > start)
            if (mid - 1 >= 0 && arr[mid - 1] == target) {
                System.out.println(mid - 1);
                return;
            } else if (arr[mid] == target) {
                System.out.println(mid);
                return;
            }
            // Check mid + 1 Boundary safe rakhne ke liye mid < end
            else if (mid + 1 < arr.length && arr[mid + 1] == target) {
                System.out.println(mid + 1);
                return;

            } else if (arr[mid] < target) {
                start = mid + 2;
            } else {
                end = mid - 2;
            }
        }
        System.out.println("Element not found");
    }
}
