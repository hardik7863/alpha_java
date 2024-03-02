//n is prime no. if it can be divisible by 1 and n itself
//otherwise it will be composite number i.e. n is divisible by any no. from 2 to n-1 








import java.util.*;
public class a047CheckNoisPrimeOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n");
        int n=sc.nextInt();
    
    //my way:-

    //     int count=0;//instead of count you can take boolean value also
    //    for (int i = 2; i <=n-1; i++) {
    //        if(n%i==0){
    //         count=1;
           
    //        }
    //    }
    //    if (count==1) {
    //     System.out.println("given no. is not prime");
    //    }
    //    else{
    //     System.out.println("given no. is  prime");
    //    }


    //Shradha didi

    //optimized code

    if (n==2) {
        System.out.println("n is prime");
        
    }
    else{
        boolean isPrime =true;
        for (int i = 2; i <=Math.sqrt(n); i++) {
            if (n%i==0) {
                isPrime= false;
            }
        }
    
        if (isPrime ==true) {
            System.out.println("n is prime");
        }
        else{
            System.out.println("n is not prime");
        }
    }
    }
}
