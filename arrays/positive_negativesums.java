public class positive_negativesums {
    public static void main(String[] args) {

        int[] arr = { 1, -1, 2, 6, -22, 3, 1, 4 };

        int positive = 0;
        int negative = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                positive = positive + arr[i];

            } else {
                negative = negative + arr[i];
            }

        }
        System.out.println("the positive sums is " + positive);
        System.out.println("the neative is " + negative);

    }
}
//O(1 )