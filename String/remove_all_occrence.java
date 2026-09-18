public class remove_all_occrence {
    public static void main(String[] args) {
        String s = "ababiabababamabababcool";
        String part = "ab";

        while (s.contains(part)) {   /// chercking ki s me 'ab' contain he ya nhi  
            int index = s.indexOf(part);       ///int index = s.indexOf("ab") ➔ indexOf ne check kiya aur pehla "ab" kis index pe he 0 to index=0
            
            /// creating a new stirng by merging the left and right part of the stirng 
            s = s.substring(0, index) + s.substring(index + part.length());///s.substring(0, 0) ➔ Khali string "" (index 0 se 0 tak kuch nahi).
        }                                                                                       ///s.substring(0 + 2) ➔ Index 2 se lekar aakhir tak ki string, yaani

        System.out.println("Cleaned String: " + s);
    }
} 