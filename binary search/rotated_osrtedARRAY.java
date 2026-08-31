public class rotated_osrtedARRAY {
    public static void main(String[] args) {
        int arr[] = { 50,60,70,10,20,30,40 };
        int start = 0;
        int end = arr.length - 1;
        int n=arr.length;
        int ans=-1;
        while (start <= end) {
            int mid = start + (end - start)  / 2;
           if (arr[mid]< arr[n-1]){
            end=mid-1;
           }
           else{
             ans=mid;
            start=mid+1;
           }

        }
        System.out.println(ans);
        

    }
}
