public class coin_change2 {
    
    static int solve (int amount , int[] coins,int index){
        /// base case
        if(amount==0){
            return 1;
        }
        if (amount < 0 || index >= coins.length) {
            return 0; // Amount negative ho gaya ya coins khatam ho gaye, rasta galat hai
        }

        // malo con ki value 5 he and amount bavlue 40 he agar me 5 ko include kr luy to 35 ho jyga remain amount is 35
        int include=solve(amount-coins[index], coins, index);


        // man lo amount 40 he aur curewnt vaklue 40 he to exclude krne ke bd to koi change nhi he so kyu ki curent coin ko exlucr kia he to mujhe next coin pe jana padega simple 

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
