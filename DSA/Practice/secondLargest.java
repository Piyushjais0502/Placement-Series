public class secondLargest {
    public static void main(String[] args){
        int[] arr = {2,4,3,5,7,5,9,5,2,11,2,33,4};
        int max = arr[0];
        int secondMax = Integer.MIN_VALUE;

        for(int i = 0; i<arr.length; i++){
            if(arr[i]>max){
                secondMax = max;
                max = arr[i];
            } else if (arr[i] <max && arr[i] > secondMax){
                secondMax = arr[i];
            }
        }
        System.out.println(secondMax);
    }
}
//time - O(n)
// space - O(1)