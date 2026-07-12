public class secondsmallest {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 67, 0 };
        int smallest=arr[0];
        int secondsmallest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < secondsmallest) {
                secondsmallest = smallest;
                smallest = arr[i];
            }
        }
        System.out.println(secondsmallest);
        System.out.println(smallest);
    }
}
