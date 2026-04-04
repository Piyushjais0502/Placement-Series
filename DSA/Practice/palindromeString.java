public class palindromeString {
    public static void main(String[] args) {
        String s = "abcdcbas";

        if(isPalindrome(s)){
            System.out.println("found");
        }else{
            System.out.println("not found");
        }

    }
    public static boolean isPalindrome(String s){
        int start = 0;
        int end = s.length()-1;

        while(start<end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
