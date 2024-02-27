import java.util.*;
   
// Type Promotion in Expressions:-
//  1. java automatically promotes each byte,shortor char operand to int when evaluting an expression.

//2.If one operand is long ,float or double the whole expression is promoted to long,float,or double respectively.





public class a013TypePromotionInExpression {
    public static void main(String[] args) {
       
       
       //case-1:-

        char a='a';
        char b='b';
        //char c=b-a; explicit onversition
        System.out.println((int)(b));
        System.out.println((int)(a));
        System.out.println(b-a);

        short x=5;
        byte y=25;
        char z='c';
       // byte bt=x+y+z; none of the variable is int still it will show error lossy conversion int to byte
        byte bt=(byte)(x+y+z);
        System.out.println(bt);


        //case-2:
         int g=10;
         float h=20.25f;
         long j=25;
         double d=30;
         //int ans =g+h+j+d; it will show loosy conversion from double to int
         double ans =g+h+j+d;
         System.out.println(ans);


         byte l=5;
         //l=l*2;
         
         // 'l*2 is converted into int (becoz it is considered as expression)'
         
         //converting int to byte will give error
        
         l=(byte)(l*2);
         byte f =5;
         byte k=(byte)(f*2);
         System.out.println(k);
    }
}
