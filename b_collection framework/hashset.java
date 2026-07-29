import java.util.*;
public class hashset {
    public static void main(String[] args) {
        Set<Integer> st = new HashSet<>();
        st.add(21);
        st.add(21);   //here duplicate values are not allowed in the set
        st.add(32);  //and also ordering is not defined in the set it can be random
        System.out.println(st);

    }
}
