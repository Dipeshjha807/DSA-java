import java.util.Scanner;

public class perfectno {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
            System.out.println("enter no");
            int num=sc.nextInt();
        int sum=1;
        for ( int i=2;i*i<=num;i++){
            if(num%i==0){
                int first=i;
                int second=num/i;
                sum=sum + first+second;
            }

        }
        if(sum==num){
            System.out.println("perfect number...");
        }
        else{
            System.out.println("not perfect n...");
        }
    }
}