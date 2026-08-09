public class rotateArray {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        /// transpose of the matrix swap arr[i][j] with arr[j][i]
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr[0].length; j++) { /// ye swap tk hum apna transpose nikal lie he
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        /// swap ka kam khtm ho gya he to ab hume row ko reverse karna he
        for (int i = 0; i < arr.length; i++) {
            int start = 0;
            int end = arr.length - 1;
            while (start < end) {
                int temp = arr[i][start];
                arr[i][start] = arr[i][end];
                arr[i][end] = temp;
                start++;
                end--;
            }
        }

        /// just for printing the rotated array
System.out.println("Rotated array is : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
