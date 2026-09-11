public class Row_WIth_Maximum1 {

    static int getfirstindex(int[][] arr, int rowindex) {
        int totalrow = arr.length;
        int totalcol = arr[0].length;
        int target = 1;
        int ans = -1;

        /// handling case where there is no one 
        if (arr[rowindex][totalcol - 1] == 0) {
            return totalcol;
        } else {
            int start = 0;
            int end = totalcol - 1;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (arr[rowindex][mid] == 0) {
                    start = mid + 1;
                } else {
                    ans = mid;
                    end = mid - 1;
                }
            }
        }
        return ans; // <--- Yeh line miss ho rahi thi!
    }

    public static int rowWithMax1(int[][] arr) {
       //n move to each row and find the first index of 1 and then calculate the number of ones in that row and keep track of the maximum number of ones and the corresponding row index.
        int totalrow = arr.length;
        int totalcol = arr[0].length;
        int ans = -1;
        int maxones = Integer.MIN_VALUE;
        
        for (int i = 0; i < totalrow; i++) {
            //for each row finds first occerence 
            int firstindex = getfirstindex(arr, i);
            int ones = totalcol - firstindex;
            if (ones > maxones) {
                // update the maximum number of ones and the corresponding row index
                maxones = ones;
                ans = i;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] arr = {{0, 0, 0, 1}, {0, 1, 1, 1}, {0, 0, 0, 0}};
        System.out.println(rowWithMax1(arr));
    }
}