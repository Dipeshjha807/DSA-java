public class reverse_word {
    public static void main(String[] args) {
        String str = "dipesh is a coder"; // test karne ke liye sentence le lete hain
        StringBuilder ans = new StringBuilder();
        int i = str.length() - 1;  // stirng ke last index pe kahada hoga 

        while (i >= 0) {
            // Peeche ke saare spaces hatao
            while (i >= 0 && str.charAt(i) == ' ') {  // mtlb he ki jaise hi i sbse last pe kahada huas thik he na lkin agar start se hi I pe space honge agat ot kya krna he uso
                                                     // to usko ignire kr ke i ko pich late rehna he 
                i--;
            }

            if (i < 0) {  // i ki bvalue <0 ho gya to ruk jana he stirng khtm ho gi he to break krt do 
                break;
            }

            int j = i;  // ab index ho gya j jo j=i kr die mtlb ye ki j i ak hi index ke uper he 
            while (j >= 0 && str.charAt(j) != ' ') {   // abhi j i dono same index pe the na to ab charcater milega na to dhkena he ki j jo he woha koi space nhi milna chaia to i ko wohi rakh ke  j ko piche lana he 
                j--;                    // j ke pass abhi chara cter he to usko piche late rehna he jb tk space na mill jai 
            }

            //  Word ko append kar do
            ans.append(str.substring(j + 1, i + 1));   /// iska mtlb  hume space mill gya he to ab hume ruik jana chaia to hum ruk gai he aur ab usko hum ans me stroe kr denge 

            //  Agle word ke liye 'i' ko 'j' par set kar do
            i = j;

            //  Agar abhi aur words bache hain, toh beech mein space lagao
            while (j >= 0 && str.charAt(j) == ' ') {
                j--;
            }
            if (j >= 0) {
                ans.append(' ');
            }
            i = j; // wapas loop sambhalne ke liye
        }
        System.out.println(ans);
    }
}