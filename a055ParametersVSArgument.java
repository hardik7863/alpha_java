import java.util.*;

   //retype name (type para 1,type para 2){
            //body
            //return statements;
        //}

public class a055ParametersVSArgument {
    

    public static int sum(int a,int b){//formal parameters
        int sum=a+b;
        //System.out.println("sum is: "+ sum);
         return sum;
    }
    public static void main(String[] args) {
        //retype name (type para 1,type para 2){
            //body
            //return statements;
        //}
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b= sc.nextInt();
        int sum2 =sum(a,b);//argument or actual parameter
        System.out.println("the sum is:"+ sum2);
    }
}
