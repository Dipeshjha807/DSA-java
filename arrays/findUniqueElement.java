public class findUniqueElement {
    public static void main(String[] args) {
        int xor=0;
        int[] nums={1,1,2,2,3,3,4,5,5,6,6};
        for(int i=0;i<nums.length;i++){
            xor=xor^nums[i];
        }
        System.out.println(xor);
    }
}