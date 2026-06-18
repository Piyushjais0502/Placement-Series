import java.util.*;
public class longestSubstring {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your string: ");

        String s = sc.nextLine();

        int left = 0;
        int maxLength = 0;

        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i<s.length(); i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(i));
            maxLength = Math.max(maxLength, i-left+1);
        }
        System.out.println(maxLength);
    }
}
