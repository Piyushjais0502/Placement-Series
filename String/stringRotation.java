import java.util.*;
public class stringRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First String : ");
        String s1 = sc.nextLine();

        System.out.println("Enter second String : ");
        String s2 = sc.nextLine();

        if(s1.length() == s2.length() && (s1+s1).contains(s2)){
            System.out.println("Compression it is");
        }
        else{
            System.out.println("Compression not exist");
        }
    }   
     
}
