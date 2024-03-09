import java.util.Scanner;

public class a066OptimizePrimeNO {
    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
    else{for (int j = 2; j < n-1; j++) {
        
    
        if (n%j==0) {
            return false;
        }
        }
        }
    return true;
        }
    public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);   
     System.out.println("enter the number");
     int n=sc.nextInt();
     System.out.println("the prime no. are:");
     for (int i =2; i <n; i++) {
        
       boolean y= isPrime(i);
       if (y) {
        System.out.println(i);
       }   
     }
    }
}
