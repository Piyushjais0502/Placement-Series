import java.util.HashMap;

public class countfrequency {
    public static void main(String[] args) {
        int arr[] = {2,5,4,6,8,9,2,2,2,2,4,4,3,3};

        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int i = 0; i<arr.length; i++){
            if(freq.containsKey(arr[i])){
                freq.put(arr[i], freq.get(arr[i])+1);
            } else {
                freq.put(arr[i], 1);
            }
        }
        System.out.println(freq);
    }
}
