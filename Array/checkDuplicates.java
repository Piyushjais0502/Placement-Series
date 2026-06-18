import java.util.HashSet;

public class checkDuplicates {
    public static void main(String[] args){
        int arr[] = {1,2,5,7,7,5,4,9,8,2,8,5,9};

        HashSet<Integer> duplicate = new HashSet<>();

        for(int num:arr){
            if(duplicate.contains(num)){
                System.out.println("Duplicate Found");
                return;
            } else {
                duplicate.add(num);
            }
        }
        System.out.println("No duplicates found");
    }
}
