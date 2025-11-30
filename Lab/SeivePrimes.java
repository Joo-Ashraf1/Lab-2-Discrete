import static java.lang.Math.sqrt;
//Singletoon design pattern


public class SeivePrimes {
    private static final int N= (int) 1e7+2;
    private static boolean[] isPrime;

    private static final SeivePrimes seive = new SeivePrimes();
    private SeivePrimes(){

        isPrime=new boolean[N];
        //initialize with true except 1,0
        for(int i=2; i <= N; i++){
            isPrime[i]=true;
        }
        //apply seive
        for(int i=2; i*i <= N; i++){
            if(isPrime[i]){
                for(int j=i*i ; j <= N; j+=i){
                    isPrime[j]=false;
                }

            }
        }

    }

    public static SeivePrimes getInstanse(){
        return seive;
    }

    public boolean isPrime(long n){
        return isPrime[(int)n];
    }




}
