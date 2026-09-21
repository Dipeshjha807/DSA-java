
public class factorial {

    static int factorials(int n){
        if (n==0){
            return 1;
        }
        int ans=2*factorials( n-1);
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(factorials(5));
    }
    
}
