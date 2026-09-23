public class printArray {
    
    static int arrprint(int[] arr,int i){
      
        if(i>=arr.length){
            return 1;
        }
        System.out.print(arr[i]+" ");
        return arrprint(arr,i+1);
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70,80};
        arrprint(arr,0);
    }
}
