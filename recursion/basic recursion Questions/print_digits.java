public class print_digits {
    static void digits(int n){
        if(n==0){
            return ;

        }
        int digit=n%10;
  
           n=n/10;
           digits(n);
                 System.out.print(digit);
    }
    
    public static void main(String[] args) {
        int n=137;
        digits(n); 
    }
}
