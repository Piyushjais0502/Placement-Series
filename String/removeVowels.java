public class removeVowels {
    public static void main(String[] args) {
        String s = "piyush";
        String r = "";

        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(ch >= 'a' && ch<='z'){
                if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u'){
                    r+=ch;
                }
            }
        }
        System.out.println(r);
    }    
}
