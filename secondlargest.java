public class secondlargest {
    
    public static void main(String[] args) {
        int[] arr={1,2,3,4,48,49,50,51,52,53,54,55,56,57,58,59,60};
        int largest = arr[0];
        int secondLargest = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest)
            {
                secondLargest=largest;
                largest=arr[i];
            }
            
        }
        System.out.println(secondLargest);
        System.out.println(largest);
}
}