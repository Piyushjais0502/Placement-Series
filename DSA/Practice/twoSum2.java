import java.util.HashSet;

public class twoSum2 {
    public static void main(String[] args){
        int[] arr = {2,5,9,7,6,10,3};
        int target = 12;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i<arr.length; i++){
            int num = target - arr[i];
            if(set.contains(num)){
                System.out.println("Pairs are:" + num +","+ arr[i]);
            }
            else{
                set.add(arr[i]);
            }
        }
    }
}
