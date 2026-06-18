import java.util.*;
public class longestSubstringPrefix{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of strings: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] arr = new String[n];
        System.out.println("Enter strings : ");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextLine();
        }

        
        Arrays.sort(arr);

        String first = arr[0];
        String last = arr[n-1];
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i<Math.min(first.length(), last.length()); i++){
            if(first.charAt(i) != last.charAt(i)){
                break;
            }
            sb.append(first.charAt(i));
        }
        System.out.println(sb.toString());
    }
}