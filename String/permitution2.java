public class permitution2 {
    static boolean compareFreq(int[] count1, int[] count2) {
        for (int i = 0; i < 26; i++) {
            if (count1[i] != count2[i]) {
                return false;
            }
        }
        return true;
    }

    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        int count1[] = new int[26];
        // s1 ki frequency table
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            int index = ch - 'a';
            count1[index]++;
        }

        int windowLength = s1.length();
        int[] count2 = new int[26];

        // S2 ki pehli window ka frequency table
        for (int j = 0; j < windowLength; j++) {
            char ch = s2.charAt(j);
            int index = ch - 'a';
            count2[index]++;
        }

        // Agar pehli hi window match ho gayi
        if (compareFreq(count1, count2)) {
            return true;
        }

        // Baaki ki remaining windows ko process karna (Sliding Window)
        for (int i = windowLength; i < s2.length(); i++) {
            // Naya character jo window ke right mein enter karega
            char newChar = s2.charAt(i);
            count2[newChar - 'a']++;

            // Purana character jo window ke left se bahar jayega
            char oldChar = s2.charAt(i - windowLength);
            count2[oldChar - 'a']--;

            // Har baar frequency compare karenge
            if (compareFreq(count1, count2)) {
                return true;
            }
        }

        return false;
    }

    // VS Code mein chalane ke liye main method
    public static void main(String[] args) {
        // Yahan permitution2 ka object banega, Solution ka nahi
        permitution2 solver = new permitution2();

        String s1 = "ab";
        String s2 = "eidbaooo";

        boolean ans = solver.checkInclusion(s1, s2);
        
        System.out.println(  ans);
    }
}