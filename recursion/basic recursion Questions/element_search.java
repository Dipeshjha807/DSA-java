public class element_search {
static int search(int[] arr,int i, int target){
    if(i>=arr.length){
        return -1;
    }
    if(arr[i]==target){
        return i;
    }
    int ans=search(arr, i+1, target);

    return ans;
}

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        int i=0;
        int target=6;
        int ans=search(arr, i, target);
        System.out.println(ans);
    }
}
