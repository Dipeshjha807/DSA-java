public class LC1981 {

static int solve(int sum,int target,int[][] arr,int row){

//bae case
if(row>=arr.length){
// mtlb hu row 1 row 2 krte krte array ke index ke niche chale gai he 
// t0 hum woha kyta krna h jo sun nikla he usko humtarget se minus krna tha to 
/// target - sum kr die he hum so w calculate the diffrence between target as sun 
/// jb bhi row jop he index se niche chle ya uske bd 
/// 

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
