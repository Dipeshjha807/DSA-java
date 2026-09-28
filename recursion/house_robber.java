public class house_robber {
    
    
    static int  rob(int[] arr,int index){
        if(index>=arr.length){
            return 0;
        }
        int includeans=arr[index]+rob(arr, index+2);
         int excludeans=0+rob(arr, index+1);
         int finalans=Math.max(includeans, excludeans);
         return finalans ;
        
    }
    
    public static void main(String[] args) {
        int index=0;
        int[] arr={2,7,9,3,1};
        int as =rob(arr, index);
    System.out.println(as);
    }
}
   