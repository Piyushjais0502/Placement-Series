public class removeDuplicates {
    public static void main(String[] args){
        int[] arr = {2,2,3,3,4,5,7,8};
        int j = 0;

        for(int i = 0; i<arr.length; i++){
            if(arr[i] != arr[j]){
                j++;
                arr[j] = arr[i];
            }
        }
        for(int i = 0; i<=j; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
