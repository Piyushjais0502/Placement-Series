public class withMultiThreading {
    public static void main(String[] args){
        long startTime = System.currentTimeMillis();

        Thread thread1 = new Thread(new numberCounter());
        Thread thread2 = new Thread(new sumCalculator());

        thread1.start();
        thread2.start();

        try{
            thread1.join();
            thread2.join();
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }

        System.out.println(System.currentTimeMillis() - startTime + " ms");
    }
}

class sumCalculator implements Runnable {
    public void run(){
        long sum = 0; 
        for(long i = 0; i < 1234567890; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}

class numberCounter implements Runnable {
    public void run(){
        int count = 0;
        for(int i = 0; i < 1234567890; i++){
            if(i % 10 == 8){
                count++;
            }
        }
        System.out.println(count);
    }
}