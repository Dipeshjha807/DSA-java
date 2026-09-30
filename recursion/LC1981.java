public class LC1981 {

static int solve(int sum,int target,int[][] arr,int row){

//bae case
if(row>=arr.length){
    return Math.abs(target-sum);
}
int min=Integer.MAX_VALUE;

// me row index pe hu multiple columnpe value padi he hr ak column pe jynga and ska ka falue lunga 
for(int num :arr[row]){
   int ans= solve(sum+ num,target,arr,row+1);
min=Math.min(min, ans);
}
return min;
}


    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int target=12;
        int row =0;
        int sum=0;

        int ans=solve(sum,target,arr,row);
        System.out.println(ans);
    }
}
