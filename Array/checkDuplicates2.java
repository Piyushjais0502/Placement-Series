public class checkDuplicates2 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};

        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[j] == arr[i]){
                    System.out.println("Duplicates Found");
                    return;
                }
            }
        }
        System.out.println("No Duplicates Found");
    }
}
