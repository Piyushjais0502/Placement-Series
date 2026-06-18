public class lowerToUpperCase {
    public static void main(String[] args) {
        String s = "piyush";
        String result = "";

        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(ch>='a' && ch<='z'){
                ch = (char)(ch-32);
            }
            result += ch;
        }
        System.out.println(result);
    }    
}
