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
/*Dry-Run hoga mere side se he agar chaia to dhek skte ho:
- arr = {1, 2, 4, 8, 9} (Stalls)
- k = 3 (Total cows)
- mindistance = 3
- Initial state: cowcount = 1, lastposition = 0

Step-by-Step Dry Run (for loop):

Iteration 1 (i = 0):
- Stall value = arr[0] = 1
- Check: arr[0] - arr[lastposition] -> 1 - 1 = 0
- Condition: 0 >= 3 -> False (Nothing happens)

Iteration 2 (i = 1):
- Stall value = arr[1] = 2
- Check: arr[1] - arr[lastposition] -> 2 - 1 = 1
- Condition: 1 >= 3 -> False (Distance too short, cow cannot be placed)

Iteration 3 (i = 2):
- Stall value = arr[2] = 4
- Check: arr[2] - arr[lastposition] -> 4 - 1 = 3
- Condition: 3 >= 3 -> True!
- Action:
  * cowcount++ -> Count becomes 2 (Second cow placed at stall 4)
  * lastposition = i -> lastposition becomes 2 (Old checkpoint forgotten, new checkpoint is index 2 / stall 4)

Iteration 4 (i = 3):
- Stall value = arr[3] = 8
- Check: Distance is measured from the updated checkpoint (lastposition = 2 / stall 4, not from the old index 0): arr[3] - arr[lastposition] -> 8 - 4 = 4
- Condition: 4 >= 3 -> True!
- Action:
  * cowcount++ -> Count becomes 3 (Third cow placed at stall 8)
  * lastposition = i -> lastposition becomes 3
  * Check: cowcount == k -> 3 == 3 -> True!

Result: Code immediately returns true. */