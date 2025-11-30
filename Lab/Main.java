import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long n1,n2;
        System.out.println("Enter the operation:(isPrime/PrimeFactorization/LcmFactorization/GcdFactorization/LcmEuclidean/GcdEuclidean):)");
        Scanner sc=new Scanner(System.in);
        String operation=sc.nextLine();
        switch (operation){
            case "isPrime":
                SeivePrimes sol= SeivePrimes.getInstanse();
                System.out.println("Enter the number to be Checked");
                n1=sc.nextLong();
                System.out.println(sol.isPrime(n1));
                break;
            case "PrimeFactorization":
                System.out.println("Enter the number ");
                n1=sc.nextLong();
                HashMap<Long, Integer> factors = PrimeFactorization.calculateFactors(n1);

                System.out.println("Prime factorization of " + n1 + ":");
                for (Map.Entry<Long, Integer> entry : factors.entrySet()) {
                    System.out.println(entry.getKey() + " ^ " + entry.getValue());
                }
                break;
            case "LcmFactorization":
                System.out.println("Enter first number ");
                n1=sc.nextLong();
                System.out.println("Enter second number ");
                n2=sc.nextLong();
                LCMUsingFactorization lc = new LCMUsingFactorization();
                System.out.println(lc.LCM(n1, n2));
                break;
            case "GcdFactorization":
                System.out.println("Enter first number ");
                n1=sc.nextLong();
                System.out.println("Enter second number ");
                n2=sc.nextLong();
                GCDUsingFactorization gc = new GCDUsingFactorization();
                System.out.println(gc.GCD(n1, n2));
                break;
            case "LcmEuclidean":
                System.out.println("Enter first number ");
                n1=sc.nextLong();
                System.out.println("Enter second number ");
                n2=sc.nextLong();
                Euclidean e1=new Euclidean();
                System.out.println(e1.lcm(n1, n2));
                break;
            case "GcdEuclidean":
                System.out.println("Enter first number ");
                n1=sc.nextLong();
                System.out.println("Enter second number ");
                n2=sc.nextLong();
                Euclidean e2=new Euclidean();
                System.out.println(e2.gcd(n1, n2));
                break;
            default:
                System.out.println("Invalid operation");

        }

    }
}
