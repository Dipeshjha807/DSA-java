public class adjacent_dupicates {
    public static void main(String[] args) {
        String str="abbaca";
        StringBuilder ans=new StringBuilder();

        for(int i=0;i< str.length();i++){
            char ch=str.charAt(i);
            /// compare answer ke right most character ko current chracter se
            if( ans.length()>0 && ans.charAt(ans.length()-1)==ch) {   ///ans.length()-1  means ans ka rightmost character 
                ans.deleteCharAt(ans.length()-1);

            }
            else{
                /// fi these 2 are different character
                ans.append(ch); 
            }
        }
        System.out.println(ans);
    }
}
