public class secondLargest {
    public static void main(String[] args){
        int arr[] = {2,4,6,9,0,3,1,8};
        int max = 0;
        int secondMax = 0;

        for(int i = 0; i<arr.length; i++){
            if(arr[i]>max){
                secondMax = max;
                max = arr[i];
            } else if(arr[i] > secondMax && arr[i] != max){
                 secondMax = arr[i];
            }
        }
        System.out.print(secondMax);
    }
}
