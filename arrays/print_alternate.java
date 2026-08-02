public class print_alternate {
    
    public static void main(String[] args) {
        
        int[] arr={1,2,3,4,5};
        int n=arr.length;
        int i=0;
        int j=n-1;
while(i<=j){
    if(i==j){
        System.out.print(arr[i]+" ");
break;
    }
    else{
        System.out.print(arr[i]+" ");
        i++;
        System.out.print(arr[j]+" ");
        j--;
    }
}

    }
}
//O(n)