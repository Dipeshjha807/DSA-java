import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class subsequence {
   
    static void sequence(String s, int index, StringBuilder output, List<String> ans) {
        // base case 
        if (index >= s.length()) {
            // subsequence ready
            String sub = output.toString();
            ans.add(sub);
            return;
        }
        
        // 1. Include (Pick) pattern
        char ch = s.charAt(index);
        output.append(ch);
        sequence(s, index + 1, output, ans);
        
        // 2. Exclude (Don't Pick) / Backtrack step
        output.deleteCharAt(output.length() - 1);
        sequence(s, index + 1, output, ans);
    }
    
    public List<String> powerSet(String s) {
        List<String> ans = new ArrayList<>();
        StringBuilder output = new StringBuilder();
        
        int index = 0;
        
        sequence(s, index, output, ans);
        Collections.sort(ans);
        return ans;
    }

    // VS Code mein run karne ke liye main method
    public static void main(String[] args) {
        subsequence sol = new subsequence();
        String s = "abc";
        List<String> result = sol.powerSet(s);
        
        System.out.println("Subsequences of " + s + ": " + result);
    }
}

