import java.util.HashMap;

public class firstNonRepeatingChar {
    public static void main(String[] args){
        String s = "anagram";

        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch : s.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            } else {
                map.put(ch, 1);
            }
        }
        for(char ch :s.toCharArray()){
            if(map.get(ch) == 1){
                System.out.print(ch);
                break;
            }
        }
    }    
}
