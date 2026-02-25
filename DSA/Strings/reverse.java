import java.util.*;

public class reverse {
    public static void main(String[] args){
        //String s = "hello";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String s = sc.nextLine();

        String r = "";


        for(int i = s.length()-1; i>=0; i--){
            r += s.charAt(i);
        }

        System.out.print(r);

        /*StringBuilder sb = new StringBuilder(s);
        sb.reverse();

        System.out.print(sb.toString());*/
        sc.close();
    }
}
