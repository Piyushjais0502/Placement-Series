public class secondLargest {
    public static void main(String[] args){
        //int[] arr = {4,5,3,8,56,3,12,22};
        int[] arr = {1,2,3,4,5,6,5,7,9,8,4};
        int max = 0;
        int secondMax = 0;

        for(int i = 0; i<arr.length; i++){
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            } else {
                if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
                }
            }
        }
        System.out.println(secondMax);
    }
}
