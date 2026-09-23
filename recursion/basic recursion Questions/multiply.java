public class multiply {
    
    static int mul(int n){
        if(n==0){
            return 1;

        }
        int ans=n*mul(n-1);
        return ans;
    }
    
    public static void main(String[] args) {
        System.out.println(mul(3));
    }
}
