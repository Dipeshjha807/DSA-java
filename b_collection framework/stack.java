import java.util.List;
import java.util.Stack;

public class stack {
      public static void main(String[] args) {
        Stack <Integer> ll = new Stack<>();

        //stack specific methods only
       ll.push(12);
       ll.push(45);
         ll.push(32);
       ll.push(41);

       System.out.println(ll);
       ll.pop();
       System.out.println(ll);

     System.out.println(ll.peek());

     System.out.println(ll.search(32));
        
        
    }
}
