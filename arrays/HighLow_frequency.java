import java.util.HashMap;

public class HighLow_frequency {
    

    public static void main(String[] args) {
        int[] arr={1,1,1,1,1,2,2,3,4,4,4,5,5,5,5,5};
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int num : arr){
            map.put(num,map.getOrDefault(num, 0)+1 );
        }
        int highest=Integer.MIN_VALUE;
        int higestnum=-1;
        for(int key:map.keySet()){
            int currentkey=key;
            int currentvalue=map.get(key);
            if(currentvalue>highest){
                highest=currentvalue;
                higestnum=currentkey;
            }
            
        }
        int lowest=Integer.MAX_VALUE;
        int lowestnum=-1;
        for(int key:map.keySet()){
            int currentkey=key;
            int currentvalue=map.get(key);
            if(currentvalue<lowest){
                lowest=currentvalue;
                lowestnum=currentkey;
            }
             }
             System.out.println("Highest frequency number is: "+higestnum+" with frequency: "+highest);
            System.out.println("Lowest frequency number is: "+lowestnum+" with frequency: "+lowest);
       


}
}