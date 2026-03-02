public class checkPalindrome {
    public static void main(String[] args){
        String s = "maama";
        /*String r = "";
        boolean isPalindrome = true;

        for(int i = s.length()-1; i>= 0; i--){
            r += s.charAt(i);
        }
        if(r.equals(s)){
            isPalindrome = true;
        } else {
            isPalindrome = false;
        }*/
        boolean isPalindrome = true;

        for(int i = 0; i<s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length()-1-i)){
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome){
            System.out.println("Palindrome found");
        } else {
            System.out.println("Not found");
        }

    }
}
