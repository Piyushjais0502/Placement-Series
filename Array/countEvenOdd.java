public class countEvenOdd {
    public static void main(String[] args){
        int[] arr = {2,4,6,3,5,8,7,12,9,6};
        int countEven = 0;
        int oddCount = 0;

        for(int i = 0; i<arr.length; i++){
            if(arr[i]%2 == 0){
                countEven++;
            }
            else {
                oddCount++;
            }
        }
        System.out.println(countEven);
        System.out.println(oddCount);
    }
}
