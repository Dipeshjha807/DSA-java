public class searchin2dMatrix {

    public static void main(String[] args) {  
        int[][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int totalrow=arr.length;
        int totalcol=arr[0].length;

        int n =totalrow*totalcol;
        int start=0;
        int end=n-1;
        int target=7;
        while(start<=end){
            int mid=start+(end-start)/2;
            int row=mid/totalcol;    /// formulas for finiding row in 2d array
            int col=mid%totalcol;   ///  formulas for finding col in 2d array

            if(arr[row][col]==target){
                System.out.println("Element found at index: "+row+","+col);
                return;
            }
            else if(arr[row][col]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        System.out.println("Element not found");
}
}