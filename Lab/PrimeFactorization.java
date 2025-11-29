import java.util.HashMap;

public class GCDUsingFactorization {
    public static long GCD(long a , long b){
        if (a == 0)
            return Math.abs(b);
        if (b == 0)
            return Math.abs(a);

        HashMap<Long ,Integer> factors_a = PrimeFactorization.calculateFactors(a);
        HashMap<Long ,Integer> factors_b = PrimeFactorization.calculateFactors(b);

        long Gcd = 1 ;

        for (var entry : factors_a.entrySet()) {
            int power ;
            Long prim = entry.getKey();
            int count_a = entry.getValue();
            int count_b = 0 ;


            if (factors_b.containsKey(prim)){
                count_b = factors_b.get(prim);
            }

            power = Math.min(count_a, count_b);

            Gcd *= (long) Math.pow(prim , power);
        }

        return Gcd ;
    }
}
