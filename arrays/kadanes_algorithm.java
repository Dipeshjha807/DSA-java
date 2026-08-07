public class kadanes_algorithm {
    public static void main(String[] args) {
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int sum = 0;
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            // step2:max update krna he
            if (sum > maxsum)
                maxsum = sum;
            // step3: sum check krte he -ve value ke lie
            if (sum < 0)                ///Agar current sum negative ho gaya hai, to usko carry karne ka koi fayda nahi. Naya subarray start karenge.
                sum = 0;
        }
        System.out.println(maxsum);
    }
}
