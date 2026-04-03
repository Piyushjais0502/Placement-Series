import java.util.*;
public class longestSubstring {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String str = sc.nextLine();

        int left = 0; 
        int maxLength = 0;

        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i<str.length(); i++){
            while(set.contains(str.charAt(i))){
                set.remove(str.charAt(left));
                left++;
            }
            set.add(str.charAt(i));
            maxLength = Math.max(maxLength, i-left+1);
        }
        System.out.println(maxLength);
    }
}
