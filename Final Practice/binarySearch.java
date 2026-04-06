import java.util.*;
public class binarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int key = sc.nextInt();

        int start =0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(arr[mid] == key){
                System.out.println("key found at :" + mid);
                return;
            }
            else if (arr[mid] < key){
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        System.out.println("Key not found");
    }
}
