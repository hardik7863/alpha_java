import java.util.*;
// binomial coefficient nCr= n!/r!(n-r)!
public class a060BinomialCoefficient {
    public static int factorial(int n){
        int f=1;
        for (int i = 1; i <=n; i++) {
            f=f*i;
        }
        return f;
    }
public static int binomialCoefficient(int n , int r){
    int fact_n =factorial(n);
    int fact_r = factorial(r);
    int fact_nmr=factorial(n-r);
    int binoCoeff=fact_n/(fact_r*fact_nmr);
    return binoCoeff;

}
 public static void main(String[] args) {
    Scanner sc =new Scanner (System.in);
    System.out.println("enter the number:");
    int n=sc.nextInt();
    System.out.println(factorial(n));

 }   
}
