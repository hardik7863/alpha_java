import java.util.*;
public class a046DisplayNoenteredExceptMultipleOf10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        do {
            System.out.println("enter the number except the multiple of 10");
            int n=sc.nextInt();
            if (n%10==0) {
                System.out.println("error");
                continue;
            }
            System.out.println(n);
            
        } while (true);
    }
}
