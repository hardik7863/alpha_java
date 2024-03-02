import java.util.*;
public class a037SumOfFirstNnumbers {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int sum=0;
        int x=1;
        System.out.println("enter the value of n");
        int n=sc.nextInt();
        while (x<n+1) {
            sum=sum+x;
         x++;
        }
        System.out.println("the sum is"+sum);

    }
}
