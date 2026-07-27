import java.util.LinkedList;

public class linkedlist{
    public static void main(String[] args) {
        LinkedList<Integer>list = new LinkedList<>();

        list.add(12);
        //addfirst will add the element at the first of the queue
        list.addFirst(2);
        System.out.println(list);

        //addlast add the element at the last of the queue
        list.addLast(20);
        System.out.println(list);

        //remove first element of the queue
        list.removeFirst();
        System.out.println(list);

          //remove last element of the queue
        list.removeLast();
        System.out.println(list);

        //it will return the first element of the linkedlist where the linkedlist will going to start here 12 is the ans
     System.out.println(  list.peek());
        
    }
}