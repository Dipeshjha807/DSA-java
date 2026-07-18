public class solid_rombus {
    public static void main(String[] args) {
        
        int n=5;
        for (int row=1;row<n;row++){
            //for each row print space thes stars
            //spaces
            for (int j=1;j<=n-row;j++){
                System.out.print(" ");
            }
            //stars

            for (int j=1;j<n;j++){
                System.out.print("*");
            }

            //move to next row for each row print space then stars

            System.out.println();
        }
    }
}
