public class linearSearch {
    public static void main(String[] args){
        int[] numbers = {2,4,6,8,10,12,14};
        int key = 10;
        int index = searching(numbers, key);
        
        if(index == -1){
            System.out.println("Not found");
        }
        else {
            System.out.println("Key Found at Index : " + index);
        }
        

    }
    public static int searching(int[] numbers, int key){
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }
}
