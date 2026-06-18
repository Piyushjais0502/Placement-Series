public class palindromeA {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,4,3,2,1};
        int start = 0; 
        int end = arr.length-1;

        while(start<end){
            if(arr[start] != arr[end]){
                System.out.println("Not Palindrome");
                return;
            }
            start++;
            end--;
        }
        System.out.println("Palindrome");
        return;
    }
}
