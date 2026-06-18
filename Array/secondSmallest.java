public class secondSmallest {
    public static void main(String[] args){
        int[] arr = {4,3,6,5,7,9,0,2};
        int min = arr[0];
        int secondMin = arr[0];

        for(int i = 0; i<arr.length; i++){
            if(arr[i]<min){
                secondMin = min;
                min = arr[i];
            }else if(arr[i]<secondMin && arr[i] != min){
                secondMin = arr[i];
            }
        }
        System.out.println(secondMin);
    }
}
