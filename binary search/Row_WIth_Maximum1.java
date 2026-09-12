public class Row_WIth_Maximum1 {

    static int getfirstindex(int[][] arr, int rowindex) {
      //  int totalrow = arr.length;
        int totalcol = arr[0].length;
        //int target = 1;
        int ans = -1;

        /// handling case where there is no one 
        if (arr[rowindex][totalcol - 1] == 0) {
            return totalcol;
        } else {
            int start = 0;
            int end = totalcol - 1;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (arr[rowindex][mid] == 0) {
                    start = mid + 1;
                } else {
                    ans = mid;
                    end = mid - 1;
                }
            }
        }
        return ans; // <--- Yeh line miss ho rahi thi!
    }

    public static int rowWithMax1(int[][] arr) {
       //n move to each row and find the first index of 1 and then calculate the number of ones in that row and keep track of the maximum number of ones and the corresponding row index.
        int totalrow = arr.length;
        int totalcol = arr[0].length;
        int ans = -1;
        int maxones = -1;
        
        for (int i = 0; i < totalrow; i++) {
            //for each row finds first occerence 
            int firstindex = getfirstindex(arr, i);
            int ones = totalcol - firstindex;
            if ( ones!=0 &&  ones > maxones) {
                // update the maximum number of ones and the corresponding row index
                maxones = ones;
                ans = i;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] arr = {{0, 0, 0, 1}, {0, 1, 1, 1}, {0, 0, 0, 0}};
        System.out.println(rowWithMax1(arr));
    }
}

/*Step 1: Loop shuru hua, aur i ki value ban gayi 0. Iska matlab computer abhi matrix ki Row 0 par hai.

Step 2: Code agli line par aaya: int firstindex = getfirstindex(arr, i);.

Step 3: Yahan computer i ki current value (jo ki 0 hai) aur poora matrix (arr) uthata hai, aur seedha getfirstindex method ko bhej deta hai. Jaise hi yeh hota hai, rowWithMax1 thodi der ke liye ruk (pause) jaata hai.

Step 4: Control ab static int getfirstindex(int[][] arr, int rowindex) ke andar chala jata hai. Yahan function ke parameter mein jo rowindex likha hai, uski value automatic 0 ho jati hai (kyunki tune i ki value 0 bheji thi).

Step 5: Ab getfirstindex apne andar wale Binary Search ko chalata hai, Row 0 ke andar dhoondta hai ki pehla 1 kahan hai, aur answer nikal kar return ans; kar deta hai (maan le answer 3 aaya).

Step 6: Jaise hi getfirstindex return karta hai, control wapas rowWithMax1 ke paas ussi line par laut aata hai. Ab firstindex variable ke andar 3 save ho jata hai!

Step 7: Ab rowWithMax1 apna baaki ka kaam karta hai (ones = totalcol - firstindex), check karta hai, aur jab pehli row ka kaam khatam ho jata hai, tab loop aage badhta hai aur i = 1 ho jata hai. */