import java.util.*;
//"" this for string 
// ' ' this is for character
//wrong use will give error
public class a032calculator {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the value of a:");
     int a=sc.nextInt();
     System.out.println("enter the value of b:");
     int b=sc.nextInt();
     System.out.println("enter the operation:");
     char operator=sc.next().charAt(0);
     switch (operator) {
        case '+':
            System.out.println(a+b);
            break;
        case '-':
            System.out.println(a-b);
            break;
        case '*':
            System.out.println(a+b);
            break;
        case '/':
            System.out.println(a+b);
            break;
        default:System.out.println("invalid operatoration entered");
            break;
     }
    }
}
