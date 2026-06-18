import java.util.*;
public class majorityElement{
    public static void main(String[] args){
        int[] arr = {1,3,5,3,6,1,1,1,1};
        HashMap <Integer, Integer> freq = new HashMap<>();

        for(int i = 0; i<arr.length; i++){
            freq.put(arr[i], freq.getOrDefault(arr[i],0)+1);
        }
        /*for(Integer key : freq.keySet()){
            if(freq.get(key) > arr.length/3){
                System.out.println(key);
            }
        }*/
       System.out.println(freq);
    }
}