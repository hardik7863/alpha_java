//function Overloading using parameters
// it depends on no. of parameterand type of parameter  not on returntype

//This is not overloading 
//int sum(int a,int b)

//float sum(int a,int b)

public class a063OverloadingUsingParameters {
    public static int sum (int a ,int b){
        return a+b;
    }
    public static int sum(int a ,int b,int c) {
        return a+b+c;
    }
    public static void main(String[] args) {
        System.out.println(sum(3,5));
        System.out.println(sum(3, 5, 1));
    }
}
