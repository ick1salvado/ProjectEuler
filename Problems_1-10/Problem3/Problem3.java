// Problem 3 :: Largest Prime Factor

public class Main{
    
    private static boolean isPrime(long l){
        if(l < 1) return false;
        if(l <= 3) return true;
        if(l % 2 == 0 || l % 3 == 0) return false;
        for(long i=5;i<(long)Math.sqrt(l);i+=6){
            if(l % i == 0 || l % (i+2) == 0) return false; 
        }
        return true;
    }
    
    public static void main(String args[]){
        long largest_prime = 0;
        for(long i=(long)Math.sqrt(600851475143L);i>0;i--){
            if((isPrime(i) == true) && (600851475143L % i == 0)){ 
                largest_prime = i;
                break;
            }
        }
        System.out.println(largest_prime);
    }
}
