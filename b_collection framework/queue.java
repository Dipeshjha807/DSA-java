import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        Queue<Integer> check = new LinkedList<>();
        check.add(12);
        check.offer(21);
        System.out.println(check);
        check.element(); //throws exception if the queue is empty
        check.peek();  // return  null  if the queue is empty
System.out.println(check);
        check.poll();
System.out.println(check);
    }
}
