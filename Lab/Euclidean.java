public class Euclidean {
    public long gcd(long a, long b){
        if(b==0){
        return a;
        }
        else{
        return gcd(b, a % b);
        }

    }
    public long lcm(long a, long b){
        return (a/gcd(a,b))*b;
    }
}
