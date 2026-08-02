public class missing_no {
    public static void main(String[] args) {
        int xor=0;
        int[] nums={1,2,3,5,6,7,8};
        for(int i=0;i<nums.length;i++){
            xor=xor^nums[i];
        }

        for(int i=1;i<=8;i++){
            xor=xor^i;
        }   
        System.out.println(xor);
    }
}
//O(n) time complexity and O(1) space complexity.
