import java.util.*;


public class a067BinaryToDecimal {
    public static void binTodec(int binNum){
        int Mynum=binNum;
        int pow=0;
        int decNum=0;
        while (binNum>0) {
            int lastdigit =binNum %10;
            decNum =decNum+(lastdigit*(int)Math.pow(2,pow));
            pow++;
            binNum=binNum/10;
        }
        System.out.println("decimal of "+ Mynum +"is:"+ decNum);
    }
 public static void main(String[] args) {

//my way;-
    // Scanner sc =new Scanner(System.in);
// System.out.println("enter the binary number:");
// int n=sc.nextInt();    
// int dec=0;
// int pow ;
// int lastdigit;

// for (int i = 0; n>0; i++) {
//     lastdigit=n%10;
//     n=n/10;
//     dec=dec+(lastdigit*(int)Math.pow(2,i));
// }
// System.out.println("the decimal no. is:"+ dec);
 binTodec(101);

}
}
