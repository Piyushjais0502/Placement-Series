import java.util.*;
public class twoSum {
    public static void main(String[] args){
        int[] arr = {2,5,9,7,6,10,3};
        int target = 12;
        int left = 0;
        int right = arr.length-1;
        Arrays.sort(arr);

        while(left<right){
            int sum = arr[left] + arr[right];
            if(target == sum){
                System.out.println("Piars are: "+arr[left]+ "," + arr[right]);
                left++;
                right--;
            }
            else if(target>sum){
                left++;
            }
            else{
                right--;
            }
        }
    }
}
