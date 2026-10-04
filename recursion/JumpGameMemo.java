import java.util.Arrays;

public class JumpGameMemo {

    public static boolean canJump(int[] nums) {
        // memo array: -1 matlab abhi check nahi kiya, 1 matlab true, 0 matlab false
        int[] memo = new int[nums.length];
        Arrays.fill(memo, -1);
        return canJumpFromIndex(nums, 0, memo);
    }

    private static boolean canJumpFromIndex(int[] nums, int currentIndex, int[] memo) {
        // Base Case
        if (currentIndex >= nums.length - 1) {
            return true;
        }

        // Agar yeh index pehle se check kiya hua hai, toh direct answer return karo!
        if (memo[currentIndex] != -1) {
            return memo[currentIndex] == 1;
        }

        int maxJump = nums[currentIndex];
        for (int jump = 1; jump <= maxJump; jump++) {
            int nextIndex = currentIndex + jump;
            
            if (canJumpFromIndex(nums, nextIndex, memo)) {
                memo[currentIndex] = 1; // Yaad rakh lo ki yahan se rasta hai
                return true;
            }
        }

        memo[currentIndex] = 0; // Yaad rakh lo ki yahan se rasta BAND hai
        return false;
    }
}
