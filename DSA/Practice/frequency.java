import java.util.HashMap;

public class frequency {
    public static void main(String[] args){
        String s = "abcdabccddaaa";
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);

            map.put(ch, map.getOrDefault(ch, 0)+1);
            
        }
        System.out.println(map);
    }
}
