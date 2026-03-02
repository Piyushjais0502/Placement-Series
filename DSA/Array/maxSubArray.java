public class maxSubArray {
    public static void main(String[] args){
        int[] arr = {3, -4, 5, 4, -1, 7, -8};
        int currSum = arr[0];
        int maxSum = arr[0];

        for(int i = 1; i<arr.length; i++){
            currSum = Math.max(arr[i], currSum + arr[i]);
            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println(maxSum);
    }
}
