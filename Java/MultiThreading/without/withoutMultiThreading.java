public class withoutMultithreading {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        long sum = 0; 
        for(int i = 0; i<1234567890; i++){
            sum+=i;
        }
        System.out.println(sum);

        int count = 0; 
        for(int i = 0; i<1234567890; i++){
            if(i % 10 == 8);
            count++;
        }
        System.out.println(count);
        System.out.println(System.currentTimeMillis()-startTime +"ms");
    }
}
