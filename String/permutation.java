public class permutation {

    static  boolean iscontain(String s1,String  s2){
   return s1.contains(s2);
    }


    public static void main(String[] args) {
        String s1="abiamcool";
        String s2="ab";
   if(s1.contains(s2)){
    System.out.println("yes");
   }
   else{
    System.out.println("no");
   }
    }
}
