public class sunof_digit {
    public static void main(String[] args) {
        int n=11111;
        int sum=0;
        while(n!=0){
            int rem=n%10;
            sum=sum+rem;
            //remove last digit 
            n=n/10;
        }
        System.out.println("The sum of digits in the given number is: " + sum);
    }
}
