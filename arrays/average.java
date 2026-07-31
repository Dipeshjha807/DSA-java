

/// find the avg of array elements
public class average {
    public static void main(String[] args) {
        double sum = 0;
int[] arr = {2,4,3,3};

for(int i = 0; i < arr.length; i++){
    sum += arr[i];
}
int size= arr.length;
double avg =  sum / size;

System.out.println(avg);
        } 
    }


