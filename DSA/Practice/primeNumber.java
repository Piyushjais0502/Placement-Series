public class primeNumber {
    public static void main(String[] args) {
        int n = 28;

        if(isPrime(n)){
            System.out.println("It is prime no.");
        }
        else{
            System.out.println("Not a prime no.");
        }
    }
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i = 2; i<=Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
