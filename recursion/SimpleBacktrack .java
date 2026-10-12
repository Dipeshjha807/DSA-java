public class SimpleBacktrack {

    // Function to generate all permutations
    public static void permute(String str, String ans) {
        // Base case: jab input string khali ho jaye
        if (str.isEmpty()) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i); // 1. Choose
            
            // Current character ko hata kar bachi hui string
            String rest = str.substring(0, i) + str.substring(i + 1);

            // 2. Explore & 3. Backtrack
            permute(rest, ans + curr);
        }
    }

    public static void main(String[] args) {
        String input = "ABC";
        System.out.println("Permutations of " + input + ":");
        permute(input, "");
    }
}
