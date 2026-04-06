import java.util.*;
public class duplicateRemove {
    public static void main(String[] args) {
        int[] arr = {1,3,4,6,4,5,5,6};
        HashSet<Integer> unique = new HashSet<>();
        for(int i = 0; i<arr.length; i++){
            unique.add(arr[i]);
        }
        System.out.println(unique);
    }    
}
