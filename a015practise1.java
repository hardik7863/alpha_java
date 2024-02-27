import java.util.*;
public class a015practise1 {
    public static void main(String[] args) {
        //Q1. In a program, input 3 numbers:A,B,c you ahve to output the average of these 3 numbers.
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("the average of three no is"+(a+b+c)/3);

        //Q2. In a program, input the side of a square .you have to output the area of the square.
        System.out.println("enter the side of the square");
        float side=sc.nextFloat();
        System.out.println("the area of square is:"+ (side*side));
        
        //Q3.enter cost of 3 items from the user(using float data type) - a pencil, a pen,and an eraser.
        //you have to output the total cost of the items back to the user as their bill
        //add 18 % gst to it?
        System.out.println("enter the price of pen");
        float pen=sc.nextFloat(); 
        System.out.println("enter the price of pencil");
        float pencil=sc.nextFloat(); 
        System.out.println("enter the price of eraser");
        float eraser=sc.nextFloat(); 
        float bill=pen+pencil+eraser;
        bill=bill+(0.18f*bill);
        System.out.println("the total bill after including GST is:" + bill);
        
        //Q4.byte b=4;
            //  char c='a';
            //  short s= 512;
            //  int i=1000;
            //  float f=3.14f;
            //  double d=99.9954;
            //  result=(f*b)+(i%c) -(d*s);
          
            //possible result will double




        //Q5. will the following statement give any error in java?
        int $=24;
        System.out.println($);
    }
}
