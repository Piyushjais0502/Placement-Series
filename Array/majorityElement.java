import java.util.HashMap;

public class majorityElement {
    public static void main(String[] args){
        int[] arr = {2,3,3,3,2,3,4,3,3,2};

        HashMap<Integer, Integer> majority = new HashMap<>();

        for(int i =0; i<arr.length; i++){
            if(majority.containsKey(arr[i])){
                majority.put(arr[i], majority.get(arr[i])+1);
            }
            else {
                majority.put(arr[i], 1);
            }
        }
        for(int key: majority.keySet()){
            if(majority.get(key)>arr.length/2){
                System.out.println(key);
            }
        }
    }
}
