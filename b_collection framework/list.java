import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class list {

    public static void main(String[] args) {
        
    
    //lsit or collection is interface
    // ArrayList is the concrete class for the  implementation

    // sommon methods which we can perform in collections
    ArrayList<Integer> list=new ArrayList<>();
   //add()
    list.add(1);
    list.add(3);
    list.add(6);
    list.add(78);
    System.out.println(list);

    //remove(index)
list.remove(1);
System.out.println(list);

//siize() -> size of the list

System.out.println(list.size());  //output=2



//set()
list.set(1,32);
System.out.println(list);


//get()
list.get(1);
System.out.println(list);
list.add(2);
System.out.println(list);
//containa()
 System.out.println(  list.contains(1));  //true

 //sort()
Collections.sort(list);
System.out.println(list);





    // List<Integer> list=new ArrayList<>();
    //collection<Integer> list=new ArrayList<>();

}
}