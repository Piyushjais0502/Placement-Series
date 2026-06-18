import java.util.HashSet;

public class removeDuplicates2 {
    public static void main(String[] args) {
        int[] arr = {2,3,1,4,3,2,5,7,8,5,7,8};
        HashSet<Integer> count = new HashSet<>();

        for(int num:arr){
            count.add(num);
        }
        System.out.print(count);
    }    
}
