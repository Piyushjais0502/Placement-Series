import java.util.*;
public class medianArray {
    public static void main(String[] args){
        int[] arr = {7,1,3,5,2};

        Arrays.sort(arr);

        double median;
        int n = arr.length;
        if(n % 2 == 0){
            median = (arr[n/2] + arr[(n/2 - 1)])/2;
        }
        else{
            median = arr[n/2];
        }
        System.out.println(median);
    }
}
