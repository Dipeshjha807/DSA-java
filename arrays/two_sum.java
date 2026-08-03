public class two_sum {
    
    public static void main(String[] args) {
    int[] nums = {2, 7, 11, 15};
    int target = 9;
    for (int i = 0; i < nums.length-1; i++) {
        for (int j = i + 1; j < nums.length; j++) {
            if (nums[i] + nums[j] == target) {
                System.out.println("Indices: " + i + ", " + j);
                
            }
        }

    }
    }
}
//O(n^2) time complexity, O(1) space complexity 
