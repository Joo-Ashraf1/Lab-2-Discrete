import java.util.HashMap;

public class LCMUsingFactorization {
    public static long LCM(long a , long b){
        if (a == 0 || b == 0)
            return 0;


        HashMap<Long ,Integer> factors_a = PrimeFactorization.calculateFactors(a);
        HashMap<Long ,Integer> factors_b = PrimeFactorization.calculateFactors(b);

        long Lcm = 1 ;

        HashMap<Long, Integer> all = new HashMap<>();
        // first we add all primes of A in All
        all.putAll(factors_a);

        for (Long p : factors_b.keySet()) {
            int exp = factors_b.get(p);
            // if prime which is in A not in B we set it with Val = 0 in B so if We take max and put it in All -> prime of A
            int current = all.getOrDefault(p, 0);
            // We take max here ( LCM -> MAX POWER )
            all.put(p, Math.max(current, exp));
        }

        for (var entry : all.entrySet()) {
            long base = entry.getKey() ;
            int power = entry.getValue() ;

            Lcm *= (long) Math.pow(base , power);
        }

        return Lcm ;
    }
}
