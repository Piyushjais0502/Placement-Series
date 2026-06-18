public class greatestElement {
    public static void main(String[] args){
        int[] arr = {1,7,6,9,3,0,2};
        int max = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
