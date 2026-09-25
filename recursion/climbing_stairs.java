public class climbing_stairs {

    static int stairs(int n) { /// yaha pe n= no of stairs to climb from 0 and the output jo he wo kitna possible way he stairs jane ka
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int ans = stairs(n - 1) + stairs(n - 2);
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(stairs(5));
    }
 }
