public class bubble {
    public static void main(String[] args){
        int[] arr = {5,4,2,3,1};
        insertionSort(arr);
        printArr(arr);

    }
    public static void insertionSort(int[] arr){
        for(int i = 1; i<arr.length; i++){
            int curr = arr[i];
            int j = i-1;

            while(j >= 0 && arr[j] > curr){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = curr;
        }
    }



    public static void selctionSort(int[] arr){
        for(int i = 0; i<arr.length; i++){
            int minPos = i;

            for(int j = i+1; j<arr.length; j++){
                if(arr[minPos] > arr[j]){
                    minPos = arr[j];
                }
            }
            int temp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos] = temp;
        }
    }


    public static void bubbleSort(int[] arr){
        for(int turn = 0; turn<arr.length-1; turn++){
            for(int j = 0; j<arr.length-1-turn; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void printArr(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
