import java.util.HashMap;
import java.util.HashSet;
import java.util.*;

public class removeDuplicates {
    public static void main(String[] args) {
        String s = "anagram";

        HashSet<Character> set = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for(int i=0; i<s.length(); i++){
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
                result.append(s.charAt(i));
            }
        }
        System.out.println(result);
    }    
}
