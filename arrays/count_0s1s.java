public class count_0s1s {
    public static void main(String[] args) {
int zero=0;
int one=0;

        int[] arr ={0,1,0,1,0,1,0,1,1,1,0};
        for (int i=0;i<arr.length;i++){
            if(arr[i]==0){
                zero++;
            }
            else{
                one++;
            }
        }
        System.out.println(zero);
        System.out.println(one);
    }
}

// time complexity=O(1)
