public class jump_game {

    static int solve(int[] arr,int index){
        if(index>=arr.length-1){
            return 1;
        } 

        // current value jaha pe me stand kr rha hu mtlb jo index ki value hwe woha pe me khada hu 
        int maxjump=arr[index];
        // ye loop us no ke uper chalrga mann lo no he 3 to 0 se 0 tk me jyga mtlb 1 2 3 jump lega aisa 

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
