public class validAnagram{
    public static void main(String[] args){
        String s = "silent";
        String r = "listen";

        if(s.length()!=r.length()){
            System.out.println("Not Anagram");
        }
        int[] freq = new int[26];

        for(int i = 0; i<s.length(); i++){
            freq[s.charAt(i) - 'a']++;
        }
        for(int i = 0; i<r.length(); i++){
            freq[r.charAt(i) - 'a']--;
        }

        for(int count:freq){
            if(count!=0){
                System.out.println("Not Anagram");
            }
        }
        System.out.println("Valid Anagram");
    }
}