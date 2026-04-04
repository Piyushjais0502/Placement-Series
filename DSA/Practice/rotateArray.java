public class rotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 3;
        int end = arr.length-1;
        rotate(arr, 0, k-1);
        rotate(arr, k, end);
        rotate(arr, 0, end);

        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        
    }
    public static void rotate(int[] arr, int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start ++;
            end --;
        }
    }
    
}
