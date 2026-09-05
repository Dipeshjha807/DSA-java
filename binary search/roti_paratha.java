public class roti_paratha {

    static boolean isvalid(int totalrotis, int[] arr, int totalcook, int mid) {

        int roticount = 0;
        for (int i = 0; i < arr.length; i++) {
            int currentcook = arr[i]; // current cook ki rank kya he pta krne ke lie
            int timetaken = 0;
            int j = 1;

            // currentcook rank=R;
            // cook 1=R1,cook2=R2 ....
            // cook krna start krna he to start kro
            while (timetaken <= mid) {
                int timeForNextParatha = j * currentcook;
                if (timetaken + j * currentcook <= mid) {
                    // iska mtlbv ye roti bann sktya he
                    timetaken += timeForNextParatha; // Yahan total time update hoga!
                    roticount++;
                    j++;

                } else {
                    // iska mtlb current roti nhi bann skt aye time limit ke ander
                    break;
                }

            }
            if (roticount >= totalrotis) {
                return true;

            }

        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        int c = 4;
        int m = 10;
        int maxrank = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxrank) {
                maxrank = arr[i];
            }
        }
        int end = maxrank * (m * (m + 1)) / 2; // max rank * total number of paratha to be made
        int start = 0;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isvalid(m, arr, c, mid)) { // m=total rotis c=totalCooks mid = timelimit
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        System.out.println(ans);
    }
}
