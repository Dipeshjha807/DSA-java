public class maxElement {
    
    static void max(int[] arr, int i , int max){
        if(i>=arr.length){
            System.out.println(max);
            return ;
        }
        if(arr[i]>max){
            max=arr[i];

        }
        max(arr,i+1,max);
    }
    
    public static void main(String[] args) {
            int arr[]={10,20,30,40,50,60,70,80};
            int i=0;
            int max=Integer.MIN_VALUE;
            max(arr,i,max);
    }
}
