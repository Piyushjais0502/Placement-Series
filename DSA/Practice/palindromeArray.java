public class palindromeArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,4,3,2,1};

        if(isPalindrome(arr)){
            System.out.println("found");
        }else{
            System.out.println("not found");
        }
    }
    public static boolean isPalindrome(int[] arr){
        int start =0; 
        int end = arr.length-1;

        while(start<end){
            if(arr[start] != arr[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
