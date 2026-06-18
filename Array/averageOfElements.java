public class averageOfElements {
    public static void main(String[] args){
        int[] arr = {3,5,7,9,3,2,5,6,8,9};
        int sum = 0;

        for(int i = 0; i<arr.length; i++){
            sum += arr[i];
            
        }
        double average = (double) sum/arr.length;
        System.out.println(average);
    }
}
