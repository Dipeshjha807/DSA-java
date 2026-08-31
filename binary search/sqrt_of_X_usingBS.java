public class sqrt_of_X_usingBS {
    public static void main(String[] args) {
        int x=56;
        int start=1;
        int end=x;
        int ans =-1;
        while(start<end){
            int mid=start+(end-start)/2;

if(x==0){
    System.out.println(0);
}

            if(mid*mid==x){   /// we can also do mid==x/mid integer over flow se bachne ke lie and same goes with all mid * mid wale me 
                System.out.println(mid);
            }
            else if(mid*mid>x){
                end=mid-1;  /// bade no ko ignore kro aur left move kro kyu ki use bads no bhi ane se wo uska sqrt nhi bann pyga so move left 
            }
            else{
                 ans=mid;  /// the small no after multiply it can be the nearest sqrt of x so store and move to start to search more nearest sqrt of x
                start=mid+1;  /// after storing that no move the start to right side to search more nearest sqrt of x
            }
        }
        System.out.println(ans);
    }
}
