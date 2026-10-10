import java.util.ArrayList;

public class permitution2 {
    
    
    static void solve (String s, String output,  ArrayList<String> ans )
    {
        if ( s.isEmpty()){
            ans.add(output);
            return ;
        }
        /// hr characer ko curent postion pe try kr ke dheko and baki recursion ko de do 
     for ( int i =0 ; i<s.length();i++){
         char ch= s.charAt(i);
         String remstring = s.substring(0,i)+s.substring(i+1);
         
         solve(remstring,output+ch,ans);
     }
        
    }
    public static void main(String[] args) {
        ArrayList<String> ans = new ArrayList<>();
        solve("abc", "", ans);
        System.out.println(ans);
    }
}
