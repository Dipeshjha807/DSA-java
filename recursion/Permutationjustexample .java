import java.util.ArrayList;
import java.util.List;

public class Permutationjustexample {

    public static List<String> getPermutations(String s) {
        List<String> allPerms = new ArrayList<>();
        
        // Base case: if the string has 1 or 0 characters
        if (s == null || s.length() <= 1) {
            allPerms.add(s == null ? "" : s);
            return allPerms;
        }
        
        // Iterate through each character in the string
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            
            // Exclude the current character to form the remaining substring
            String remaining = s.substring(0, i) + s.substring(i + 1);
            
            // Recursively get permutations of the remaining characters
            List<String> subPerms = getPermutations(remaining);
            
            // Prepend the current character to each sub-permutation
            for (String perm : subPerms) {
                allPerms.add(currentChar + perm);
            }
        }
        
        return allPerms;
    }

    public static void main(String[] args) {
        String text = "abc";
        List<String> result = getPermutations(text);
        System.out.println("Permutations of '" + text + "': " + result);
    }
}
