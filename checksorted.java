public class checksorted {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 2, 3213, 3, 1 };
        boolean sorted=true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                     sorted=false;
                     break;
            }
        }
        if(sorted){
            System.out.println("array is  sorted");
        }
        else
        {
            System.out.println("not sorted");
        }
    }

}
