import java.util.Scanner;

public class gcd{
    public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);

  System.out.print("enter the no A :");
  int a=sc.nextInt();
  System.out.println("enter the no B :");
  int b= sc.nextInt();
   

        while(b != 0) {  //Euclidean Algorithm   ///Euclidean Algorithm me jab `b = 0` ho jata hai, tab `a` hi GCD hota hai.
            int temp = b;
            b = a % b;
            a = temp;
        }

        System.out.println("GCD is: " + a);
        sc.close();
    }
}/*18,12
 ↓
12,6
 ↓
6,0
 ↓
GCD = 6 */