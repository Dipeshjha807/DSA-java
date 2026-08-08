public class Sum_Of_each_col {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int sum=0;
        for(int j=0;j<arr[0].length;j++){
            for(int i=0;i<arr.length;i++){
                sum+=arr[i][j];
            }
            System.out.println("Sum of column "+j+" is: "+sum);
            sum=0; // Reset sum for the next column
        }
    }
}
