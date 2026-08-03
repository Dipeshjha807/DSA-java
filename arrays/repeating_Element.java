public class repeating_Element {
    public static void main(String[] args) {
        
    
    int[] arr={1,2,3,4,5,6,7,4,8,9,5,10};
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length-1;j++){
            if(arr[i]==arr[j]){
                System.out.println(arr[j]);
            }
           

        }
    }
}
}
