import java.util.Scanner;

public class sum_ofNO {
    static int sums(int n){
        if(n==0){

            return 0;
        }
        int ans=n+sums(n-1);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the nos");
        int n=sc.nextInt();
       System.out.print( sums(n));
                

        sc.close();
    }
}
