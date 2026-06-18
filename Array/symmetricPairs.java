import java.util.HashMap;

public class symmetricPairs {
    public static void main(String[] args) {
        int[] [] arr = {
            {1,2},
            {3,4},
            {2,1},
            {5,6},
            {4,3}
        };

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<arr.length; i++){
            int first = arr[i][0];
            int second = arr[i][1];

            if(map.containsKey(second) && map.get(second) == first){
                System.out.println("(" + first + "," + second + ")");
            }
            map.put(first, second);
        }
    }
}
