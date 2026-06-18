public class sortedOrNot {
    public static void main(String[] args){
        int[] arr = {2,4,6,3,9,11};
        boolean isSorted = true;

        for(int i = 1; i< arr.length; i++){
            if(arr[i]<arr[i-1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("Sorted");
        }else {
            System.out.println("Not Sorted");
        }
    }
}
