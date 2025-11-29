import java.util.HashMap;

public class PrimeFactorization {
    public static HashMap<Long , Integer> calculateFactors(long n){
        HashMap<Long , Integer> factors = new HashMap<>();

        for(long d = 2; d * d <= n ; d++){
            int count = 0 ;
            while(n % d == 0){
                count ++ ;
                factors.put(d , count) ;
                n /= d ;
            }
        }
        // N is prime
        if (n > 1){
            factors.put(n , 1);
        }

        return factors ;
    }
}
