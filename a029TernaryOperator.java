//ternary operator 
//variable=condition?statement1:statement2;
//boolean larger =(5>3)5:3;
//String type=(5%2=0)?"even":"odd";



public class a029TernaryOperator {
    public static void main(String[] args) {
        int number =4;
        String type =((number%2==0)?"even":"odd");
        System.out.println(type);
    }
}
