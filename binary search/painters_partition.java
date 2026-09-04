public class painters_partition {

static boolean isvalid(int arr[], int k, int maxlength) {      /// maxlength  is same as mid hum yaha koi bhi maxlenght nh9 nikal rhe he wohi mid hi nikal rhe he bs jb bhi functioncall hota he tb jo mid ka value he wohi maxlength me assign ho jata he
    /// mid is the max length of boards
    /// k is the number of painters
    /// arr is the array of boards
    int paintercount = 1;
    int boardsum = 0;
    for (int i = 0; i < arr.length; i++) {
        if(boardsum + arr[i] <= maxlength) {
            boardsum += arr[i];
        } else {
            // current painter cannot paint this board, so we need a new painter
            paintercount++;
            if (paintercount > k || arr[i] > maxlength) {
                return false;
            }
            boardsum = arr[i];
        }
    
    }
    return true;
}

    public static void main(String[] args) {
        int[] arr = { 5,10,30,20,15 };
        int k = 3;

        int sum = 0;
        int start = 0;
       
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
             
        }
         int end = sum;
          int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (isvalid(arr, k, mid)) {
                /// valid so store the potential answer in ans and move end to mid-1 becuse
                /// after that mid all are possible ans but we want the min so mov end=mid-1
                ans = mid;
                end = mid - 1;
            } else {
                /// not valid so increase the mid value
                start = mid + 1;
            }
        }
        System.out.println("Minimum time to paint all boards: " + ans);

    }
}
