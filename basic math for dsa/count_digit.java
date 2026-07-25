

public class count_digit {
    public static void main(String[] args) {
  
        int n=1231111145;
        int count=0;
         while(n!=0){
             int rem=n%10;
            count++;
             //remove last digit 
             n=n/10;
         }
         
        System.out.println("The number of digits in the given number is: " + count);
    }
}
