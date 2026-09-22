public class noPrinting {

    static void numbers(int n){
        if (n==0){
            return;
        }
        numbers(n-1);

        System.out.print(n+ " ");
        
    }

    public static void main(String[] args) {
    numbers(10);
    }
}
