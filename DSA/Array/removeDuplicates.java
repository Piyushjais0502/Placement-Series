public class removeDuplicates {
    public static void main(String[] args){
        int[] arr = {0,1,2,3,3,4,5,6,6,7};
        int i = 0;
        if(arr.length<1) System.out.print(0);

        for(int j = 1; j<arr.length; j++){
            if(arr[j] != arr[i]){
                i++;
                arr[i] = arr[j];
            }
        }
        for(int k = 0; k<arr.length; k++){
            System.out.print(k);
        }
    }
}
