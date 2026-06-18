public class checkPalindrome {
    public static void main(String[] args){
        String s = "madam";
        String r = " ";
        boolean isPalindrome = false;;

        for(int i = s.length()-1; i>=0; i--){
            r+= s.charAt(i);
        }
        if(s.equals(r)){
            isPalindrome = true;
        }else{
            isPalindrome = false;
        }
        if(isPalindrome){
            System.out.println("palindrome found");
        } else{
            System.out.println("palindrome not found");
        }
    }    
}
