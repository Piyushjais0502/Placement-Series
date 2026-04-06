import java.util.*;
public class duplicate2 {
    public static void main(String[] args) {
        int[] arr = {1,2,5,4,3,6,4,5};

        Arrays.sort(arr);

        for(int i = 0; i<arr.length-1; i++){
            if(arr[i] == arr[i+1]){
                System.out.println("Duplicates are: "+ arr[i]);
            }
        }
    }    
}
