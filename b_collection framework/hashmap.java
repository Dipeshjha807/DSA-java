import java.util.*;
import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();  //hashmap dosent maintain the order preservation so if we want order we can use linkedhashmap

        // insertion
        map.put("dipesh", 2);
        map.put("ayush", 3);
        map.put("ashish", 21);
        map.put("sunny", 200);
        System.out.println(map);

        Map<String, Integer> table = new HashMap<>();
        table.put("amit", 6);

        /// here we put all the values from map in the table mean putall insert all the
        /// values form one map to another map
        table.putAll(map);
        System.out.println(table);

        // deletion
        table.remove("dipesh");
        System.out.println(table);
        // if the value is not present it will return the default value i.e 0 in this
        // case
        System.out.println(table.getOrDefault("dipesh", 0));
        System.out.println(table.containsValue(3));// true
        table.replace("amit", 1); // here it replace the value of amit form 6 to 1
        System.out.println(table);

        System.out.println(table.keySet()); // here it will return all the key pair

    }

}
