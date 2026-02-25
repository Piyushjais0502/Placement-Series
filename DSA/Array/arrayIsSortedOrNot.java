import java.util.*;
public class arrayIsSortedOrNot {
    public static void main(String[] args) {
        //int[] arr = {1,2,4,4,5};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter Array Elements : ");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        boolean isSorted = true;

        for(int i = 1; i<arr.length; i++){
            if(arr[i]<arr[i-1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("Array is Sorted");
        } else {
            System.out.println("Array is not sorted");
        }
    }
}
