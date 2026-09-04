public class EKO_spoj_TREE {
    
static boolean isvalid(int arr[], int m, int maxhight) {
    int totalwoodcount = 0;
    for(int i=0;i<arr.length;i++){  // arr is the array of trees hights so we traverste form tree 1 to tree n and check if the tree hight is greater than maxhight then we will cut the tree and add the wood to woodcount
        if(arr[i]>maxhight){
            //iska mtlb sawblade overall tree hight se chota he
            // therefore we will cut the tree and add the wood to woodcount 
           int  Currenttreewoodcollected=arr[i]-maxhight;  // if integer over flow the use long in the place of int
           totalwoodcount+=Currenttreewoodcollected;
        }
    }
    if( totalwoodcount>=m){
        return true;
    }
    else{
        return false;
    }
}

    public static void main(String[] args) {
        int[] arr={20,15,10,17};
        int m=7;
        int start=0; 
        int ans=-1; 
    int maxi=-1;
    for(int i=0;i<arr.length;i++){
               if(arr[i]>maxi){
                   maxi=arr[i];
               }
    }
    int end=maxi;

    while(start<=end){
        int mid=start+(end-start)/2;
        if(isvalid(arr,m,mid)){
            //store the ans 
            ans=mid;
            // hum start ko move is lie kr rhe he ku ki hume maximum hight chaia blae ka jaha pe hume minimum wood blocks mill jai to hum agar ex= place ko 5 pe rakhe to hume ans mill jyga kyu ki trees ka hight 20 15 ... aisa he to agar 5 ke hight pe hume mill rha he
            // to hume 5 ke niche wlae hight i.e 4 3 2.. pe bhi mil jyga na to hume to max hight chaia to hume 5 se nich wla nhi 5 s uper waa chaia hoga usilie agar vaid he to store kro
            /// and start ko move kro kyu ki max chaia usilie 
            start=mid+1;
    }
    else{
        end=mid-1;
    
    }
}
System.out.println(" the answer is: " + ans);
}
}
