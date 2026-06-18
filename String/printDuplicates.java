import java.util.HashMap;

public class printDuplicates {
    public static void main(String[] args) {
        String s ="programming";

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i<s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }
            else{
                map.put(s.charAt(i), 1);
            }
        }
        for(char ch:map.keySet()){
            if(map.get(ch)>1){
                System.out.print(ch);
            }
        }
    }    
}
