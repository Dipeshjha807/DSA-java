public class counteven {
    public static void main(String[] args) {

        
        int[] arr = {1,2,3,4,5};
        int evencount = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                evencount++;
            }
        }

        if(evencount == 0) {
            System.out.println("No even number in the array");
        } else {
            System.out.println("Number of even numbers in the array: " + evencount);
        }
    }
}