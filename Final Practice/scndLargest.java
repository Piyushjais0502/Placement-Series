public class scndLargest {
    public static void main(String[] args) {
        int[] arr = {-2,5,3,7,0,-4,2,11,10};
        int max = arr[0];
        int sMax = arr[0];

        for(int i = 0; i<arr.length; i++){
            if(max < arr[i]){
                sMax = max;
                max = arr[i];
            }
            else if (arr[i]<max && arr[i]>sMax){
                sMax = arr[i];
            }
        }
        System.out.println(sMax);
    }
}
