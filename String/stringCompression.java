import java.util.*;
public class stringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");

        String s = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        int count =1;

        for(int i=0; i<s.length(); i++){
            if(i<s.length()-1 && s.charAt(i) == s.charAt(i+1)){
                count++;
            } else{
                sb.append(s.charAt(i)).append(count);
                count = 1;
            }
        }
        System.out.print("Final String " + sb);
    }    
}
