public class sumOfAllElements {
    public static void main(String[] args){
        int arr[] = {3,4,6,7,3,2,8};
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
