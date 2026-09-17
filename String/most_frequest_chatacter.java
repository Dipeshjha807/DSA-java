

public class most_frequest_chatacter {
    public static void main(String[] args) {
        String s = "my name is dipesh jha";
        int[] freq = new int[26];

        // Traverse over string and update their frequency accordingly
        for (int i = 0; i < s.length(); i++) {
            char currentchar = s.charAt(i);
            
            // 💡 Space ko ignore karne ke liye check lagana zaroori hai
            if (currentchar >= 'a' && currentchar <= 'z') {
                freq[currentchar - 'a']++;
            }
        }
        
        int maxfreq = -1;
        char ans = ' '; // 💡 Yahan ek default value dena zaroori hai!

        // Traverse over the freq array 
        for (int i = 0; i < 26; i++) {
            if (freq[i] > maxfreq) {
                maxfreq = freq[i];
                ans = (char)(i + 'a');
            }
        }
        
        System.out.println("Most frequent character: " + ans);
    }
}