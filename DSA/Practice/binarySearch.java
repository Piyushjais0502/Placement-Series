public class binarySearch {
    public static void main(String[] args){
        int[] arr = {2,4,6,8,10,12,14,16,18};
        int key = 16;
        int start = 0;
        int end = arr.length-1;
        

        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid] == key){
                System.out.println("Key found at: " + mid);
                break;
            }
            else if(key>arr[mid]){
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
    }
}
