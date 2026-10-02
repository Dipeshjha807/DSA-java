public class jump_game {

    static int solve(int[] arr,int index){
        if(index>=arr.length-1){
            return 1;
        }
        int maxjump=arr[index];
        for(int i=1;i<=maxjump;i++){
            int check=solve(arr, index+i);
            if(check==1){
                return 1;
            }
        }
        return 0;
    }


    public static void main(String[] args) {
        int index=0;
        int[] arr={2,3,1,1,4};
 int ans =solve (arr,index);
 System.out.println(ans);
    }
}
