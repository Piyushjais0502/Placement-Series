class minandmax{
    public static void main(String[] args){
        int[] arr = {3,2,5,8};
        int max = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
            //return max;
        }
        int minn = max;
        for(int i =0; i<arr.length; i++){
            //int minn = max;
            if(minn>arr[i]){
                minn = arr[i];
            }
        }
        System.out.println("Max : " +max);
        System.out.println("Min : " + minn);
    }
}