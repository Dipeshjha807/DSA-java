import java.util.ArrayDeque;

import java.util.*;

public class arraydeque {
    public static void main(String[] args) {
        
   Deque<Integer> q=new ArrayDeque<>();
   q.offer(12);
   q.offerFirst(60);
   q.offerLast(10);
   System.out.println(q);
   q.pollLast();
   System.out.println(q);
   
    }
}
