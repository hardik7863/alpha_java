import java.util.*;
public class a068DecimalToBinary {
    public static void decToBin(int n){
        int x= n;
        int pow=0;
        int binNum=0;
        while (n>0) {
            int rem=n%2;
            binNum=binNum + (rem*(int)Math.pow(10,pow));
            pow++;
            n=n/2;

        }
        System.out.println("binary form of" + x +" is" + binNum);
    } 
    public static void main(String[] args) {
      
       // Myway:-     
        // Scanner sc =new Scanner(System.in);
        // System.out.println("enter the decimal number: ");
        //  int n= sc.nextInt();
        //  int bin=0;  //this code is not suitable for 2,4,8
        //  int prev=n;
        //  while (n>0) {
        //     int rem=n%2;
        //     n=n/2;
        //     bin=bin*10+ rem;
        //  }
        //  System.out.println("the binary no is" + bin);
        decToBin(3);
    }
}
