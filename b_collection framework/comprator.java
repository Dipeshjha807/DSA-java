import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class comprator {

    public static void main(String[] args) {
        List<Comparator2> student = new ArrayList<>();

        student.add(new Comparator2(19, "dipesh", 50));
        student.add(new Comparator2(23, "ayush", 54));
        student.add(new Comparator2(29, "amit", 70));
        student.add(new Comparator2(59, "ashish", 51));

        Collections.sort(student);
        System.out.println(student);

        // //List<Integer> list = new ArrayList<>();
        // list.add(21);
        // list.add(2);
        // list.add(211);
        // list.add(31);
        // System.out.println(list);
        // Collections.sort(list);
        // System.out.println(list);
    }
}
