public class minElement {
    
     
    static void minm(int[] arr, int i , int min){
        if(i>=arr.length){
            System.out.println(min);
            return ;
        }
        if(arr[i]<min){
            min=arr[i];

        }
        minm(arr,i+1,min);
    }
    
    public static void main(String[] args) {
         int arr[]={10,20,30,40,50,60,70,80};
            int i=0;
            int min=Integer.MAX_VALUE;
            minm(arr,i,min);
    }
}
