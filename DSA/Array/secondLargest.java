public class secondLargest {
    public static void main(String[] args){
        int[] arr = {4,5,3,8,34,56,3,12,22};
        int max = 0;
        int secondMax = 0;

        for(int i = 0; i<arr.length; i++){
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            }
        }
        System.out.println(secondMax);
    }
}
