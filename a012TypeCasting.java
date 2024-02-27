import java.util.*;

//typecasting:- In this type of conversion we forcefully convert the larger datatype into smaller datatype.
//This type of conversion is known as explicit and narrow conversion.
public class a012TypeCasting {
 public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    float a=125.12f;
    int b=(int) a;//typecasting
    System.out.println(b);
    char ch='a';
    int number=ch;//typecasting into ASCII value
    System.out.println(number);
 }   
}
