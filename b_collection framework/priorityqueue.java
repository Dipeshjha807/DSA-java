
import java.util.PriorityQueue;
import java.util.Queue;

public class priorityqueue {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>();
       
        // default behaviour of the priority queue is less the value higher the priority
       
        pq.offer(30);
        pq.offer(40);
        pq.offer(50);
        pq.offer(60);
        pq.offer(70);
        System.out.println(pq);
System.out.println(pq.poll());
    }

}
