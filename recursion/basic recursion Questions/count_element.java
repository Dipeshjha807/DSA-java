public class count_element {
   
    static void count(int[] arr,int i,int count, int target){
        if(i>=arr.length){
            System.out.println(count);
            return ;
        }
        if(arr[i]==target){
            count++;

        }
        count(arr,i+1,count,target  );
        
    }
   
    public static void main(String[] args) {
        int[] arr={1,2,3,3,4,5,6,6,7,8,6,1,1,1,1,1};
        int count=0;
        int i=0;
        int target=1;
        
    count(arr, i, count, target);   
    }
}
