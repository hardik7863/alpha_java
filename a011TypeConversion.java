import java.util.*;
public class a011TypeConversion {
    //type conversion :-conversion which java does automatically
    //also known as widening and implicit conversion.


    //conversion happens when :
    //a)type compatible 
        //eg:-int<->float
        //int<->boolean not possible (not compatible)
    //b)destination type>source type

    //byte->short->int ->float ->long ->double

    


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=25;
        long b=a;
        System.out.println(b);//possible

        long c=8;
       // int d=c;
       // System.out.println(d);

       //int e=sc.nextFloat();

       //throws error(lossy conversion) because of imcompatible data type
       

    }
}
