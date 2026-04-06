import java.util.*;
public class duplicate3 {
    public static void main(String[] args){
        int[] arr = {1,2,4,5,8,2,5,3,3,1};
        Arrays.sort(arr);

        for(int i = 0; i<arr.length-1; i++){
            if(arr[i] == arr[i+1]){
                System.out.print(arr[i]);
            }
        }

        
    }
}
