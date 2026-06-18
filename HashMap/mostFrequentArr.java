import java.security.Key;
import java.util.HashMap;

public class mostFrequentArr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,4,3,2,2};

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<arr.length; i++){
            //if(map.containsKey(arr[i])){
                map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
            //}
        }
        int maxElement = arr[0];
        int count = 0;

        for(int key : map.keySet()){
            if(map.get(key) > count){
                count = map.get(key);
                maxElement = key;
                
            }
        }
        System.out.println("Max Element : " + maxElement + " and " + "occurencs " + count);
    }    
}
