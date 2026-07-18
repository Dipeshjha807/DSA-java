

public class solid_rectangular {
    
    public static void main(String[] args) {
        
         int n=4;

         for (int i=1; i<=n; i++){

            ///for eanch row print 5 cols
             for (int j=1; j<=7; j++){
                 System.out.print("*");
             }
             //move to next row for each row print 5 cols
             System.out.println();
         }
    }
}
