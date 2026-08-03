public class missing_no {

    //to do in GFG
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

/*O(n) time complexity and O(1) space complexity\//
(1 ^ 2 ^ 3 ^ 5 ^ 6 ^ 7 ^ 8)
^
(1 ^ 2 ^ 3 ^ 4 ^ 5 ^ 6 ^ 7 ^ 8)

XOR ka rule=a ^ a = 0
Aur XOR me jo number pair nahi paata, wahi end me bachta hai
//1 ^ 1 = 0
//2 ^ 2 = 0
//3 ^ 3 = 0
//5 ^ 5 = 0
//6 ^ 6 = 0
//7 ^ 7 = 0
//8 ^ 8 = 0
// to bacha 4 to wohi missing element he */