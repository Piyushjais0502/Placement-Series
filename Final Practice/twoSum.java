import java.util.HashSet;

public class twoSum {
    public static void main(String[] args) {
        int[] arr = {2,5,7,9,2,1,10};
        int target = 11;
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i<arr.length; i++){
            int num = target - arr[i];
            if(set.contains(num)){
                System.out.println("Numbers are : "+ num + "," + arr[i]);
            }
            set.add(arr[i]);
        }
    }
}
