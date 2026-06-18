import java.util.HashMap;

public class twoAraayWithSameElemntOrNot {
    public static void main(String[] args) {
        int[] arrA = {1,2,3,4,2,3};
        int[] arrB = {3,2,4,3,2,1};

        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();

        for(int i = 0; i<arrA.length; i++){
            if(map1.containsKey(arrA[i])){
                map1.put(arrA[i], map1.get(arrA[i])+1);
            }
            else {
                map1.put(arrA[i], 1);
            }
        }
        for(int i = 0; i<arrB.length; i++){
            if(map2.containsKey(arrB[i])){
                map2.put(arrB[i], map2.get(arrB[i]) + 1);
            }
            else {
                map2.put(arrB[i], 1);
            }
        }
        System.out.println("map1 equals map2: " + map1.equals(map2));
    }    
}
