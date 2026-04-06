import java.util.Arrays;

public class twoSum2 {
    public static void main(String[] args){
        int[] arr = {2,4,6,7,9,10,1};
        int target = 11;
        int end = arr.length-1r;
        int start = 0;

        Arrays.sort(arr);
        while(start<end){
            int sum = arr[start] + arr[end];
            if(sum == target){
                System.out.println(arr[start] + "," + arr[end]);
                start++;
                end--;
            }
            else if(target>sum){
                start++;
            }
            else{
                end--;
            }
        }
    }
}
