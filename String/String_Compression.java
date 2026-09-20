public class String_Compression {
    public static void main(String[] args) {
        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        
        int readindex = 0;
        int writeindex = 0;
///// loop char arrsay ko travel akrega 

        while (readindex < chars.length) {
            char currentchar = chars[readindex]; 
            int count = 0;


            /// count duplicate character ko kr rha he 
            while (readindex < chars.length && chars[readindex] == currentchar) {
                readindex++;
                count++;
            }
            // ab mere pass current character  and uska count dono he 

            chars[writeindex] = currentchar;
            writeindex++;

            // now insert the count 
            if (count > 1) {
                String countStr = String.valueOf(count);
                for (char digit : countStr.toCharArray()) {
                    chars[writeindex] = digit;
                    writeindex++;
                }
            }
        }
        
        // Output dekhne ke liye
        System.out.print("Compressed Output: ");
        for (int i = 0; i < writeindex; i++) {
            System.out.print(chars[i] + " ");
        }
    }
}
