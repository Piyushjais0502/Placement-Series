
import java.util.*;

public class duplicatesRemove {
    public static void main(String[] args){
        int[] arr = {2,4,3,2,5,3,4,5};
        Set<Integer> set = new LinkedHashSet<>();

        for(int i = 0; i<arr.length; i++){
            set.add(arr[i]);
        }
        System.out.print(set);
    }
}
