

public class print_alldigits {
    
    public static void main(String[] args) {

        int n=12345;
         while(n!=0){
             int rem=n%10;
             System.out.println(rem);
             //remove last digit 
             n=n/10;
         }
    }
    
}
