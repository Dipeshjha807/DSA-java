public class coin_change2 {
    
    static int solve (int amount , int[] coins,int index){
        /// base case
        if(amount==0){
            return 1;
        }
        if (amount < 0 || index >= coins.length) {
            return 0; // Amount negative ho gaya ya coins khatam ho gaye, rasta galat hai
        }
        int include=solve(amount-coins[index], coins, index);

        int exclude=solve(amount, coins, index+1);
        int finalans=include+exclude;
        return finalans;
       

    }
    

    public static void main(String[] args) {
            int index=0;
            int amount=5;
            int[]coins={1,2,5};
                int ans = solve(amount,coins,index);
                System.out.println(ans);
        }
}
