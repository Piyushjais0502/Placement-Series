import java.util.HashMap;


public class duplicate {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,6,8,7,4,9,5,5,4,6,4};
        HashMap<Integer, Integer> set = new HashMap<>();

        for(int i = 0; i<arr.length; i++){
            set.put(arr[i], set.getOrDefault(arr[i], 0)+1);
        //System.out.println("Not found");
        }
        for(int key:set.keySet()){
            if(set.get(key)>1){
                System.out.println(key);
            }
        }

    }
}
