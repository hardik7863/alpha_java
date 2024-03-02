import java.util.*;
public class a036Print1toN {
 public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("enter the value of n");
    int n=sc.nextInt();
    int x=1;
    while (x<n+1) {
        System.out.println(x);
        x++;
    }
    sc.close();
}   
}
