import java.util.HashMap;
import java.util.HashSet;

public class pairwithsum {
    public static void main(String[] args){
        int[] arr = {1,3,5,3,2,6,4,7,9};
        int target = 11;

        HashSet<Integer> pair = new HashSet<>();

        for(int i = 0; i<arr.length; i++){
            int num = target - arr[i];
            if(pair.contains(num)){
                System.out.print("pair is " + num + " and " + arr[i]);
                return;
            }
            else {
                pair.add(arr[i]);
            }
        }
        System.out.println("Not Found");
    }
}
