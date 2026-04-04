import java.util.HashSet;

public class duplicate2 {
    public static void main(String[] args){
        int[] arr = {1,2,4,5,8,8};
        HashSet<Integer> set = new HashSet<>();
        
        for(int i = 0; i<arr.length; i++){
            if(set.contains(arr[i])){
                System.out.println("Duplicate is : "+ arr[i]);
                return;
            }
            else{
                set.add(arr[i]);
            }
        }
        System.out.println("No duplicate");
    }
}
