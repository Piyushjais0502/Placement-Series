public class maxProductSubarray {
    public static void main(String[] args){
        int[] arr = {2,3,-2,6,-3};
        int maxProduct = arr[0];
        int minProduct = arr[0];
        int result = arr[0];

        for(int i = 1; i<arr.length; i++){
            int temp = maxProduct;

            maxProduct = Math.max(arr[i], Math.max(maxProduct*arr[i], minProduct *arr[i]));
            minProduct = Math.min(arr[i], Math.min(temp * arr[i], minProduct*arr[i]));

            result = Math.max(result, maxProduct);
        }
        System.out.println(result);
    }
}
