public class palindromeS {
    public static void main(String[] args) {
        String s = "madam";
        int start = 0; int end = s.length()-1;

        while(start<end){
            if(s.charAt(start) != s.charAt(end)){
                System.out.println("Not plindrome");
                return;
            }
            start++;
            end--;
        }
        System.out.println("Palindrome");
        return;
    }
}
