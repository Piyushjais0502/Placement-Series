public class checkPalindrome {
    public static void main(String[] args){
        String s = "maam";
        String r = "";
        boolean isPalindrome = true;

        for(int i = s.length()-1; i>= 0; i--){
            r += s.charAt(i);
        }
        if(r.equals(s)){
            isPalindrome = true;
        } else {
            isPalindrome = false;
        }
        if(isPalindrome){
            System.out.println("Palindrome found");
        } else {
            System.out.println("Not found");
        }

    }
}
