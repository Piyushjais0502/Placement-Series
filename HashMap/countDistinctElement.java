import java.util.HashSet;

public class countDistinctElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,3,4};
        //int count = 0;

        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i<arr.length; i++){
            if(!set.contains(arr[i])){
                set.add(arr[i]);
                //count++;
            }
        }
        System.out.println(set.size());
    }    
}
