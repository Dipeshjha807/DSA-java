public class coin_change3 {
    static int solve(int[]coin,int amount){
        if(amount==0){
            return 0;

        }
        if(amount<0){
            return Integer.MAX_VALUE;
        }
        int min=Integer.MAX_VALUE;
        // mere pass ak am0out he me is amount ke lie sare coins ke lie try krunga and also make sure ki sb coin try kru

        for(int coins:coin)
{
    int check=solve(coin, amount -  coins);
    if(check==Integer.MAX_VALUE){
        continue;
    }
else{
    int totalcoinused=check+1;
    min=Math.min(min, totalcoinused);
}
}
return min;
    }
    
   
    public static void main(String[] args) {
        int[] coin={1,2,3};
        int amount =2;
        int ans=solve(coin,amount);
        System.out.println(ans);
    }
}
