
import java.util.HashMap;

public class leastFrequentArr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,4,3,2,2};

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<arr.length; i++){
            //if(map.containsKey(arr[i])){
                map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
            //}
        }
        int minElement = arr[0];
        int count = Integer.MAX_VALUE;

        for(int key : map.keySet()){
            if(map.get(key) < count){
                count = map.get(key);
                minElement = key;
                
            }
        }
        System.out.println("Min Element : " + minElement + " and " + "occurencs " + count);
    }    
}
