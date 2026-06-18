public class countVowelsANDConsonaint {
    public static void main(String[] args) {
        String s = "Piyush";
        int vowels = 0; 
        int consonaint = 0;

        s=s.toLowerCase();

        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(ch>='a' && ch<='z'){
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    vowels++;
                } else{
                    consonaint++;
                }
                
            }
        }
        System.out.println("Vowel = " + vowels);
        System.out.println("Consonent = " + consonaint);
    }
}
