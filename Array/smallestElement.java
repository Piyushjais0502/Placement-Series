public class smallestElement {
    public static void main(String[] args){
        int[] arr = {3,5,1,7,5};
        int min = arr[0];

        for(int i = 0; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.print(min);
    }
}
