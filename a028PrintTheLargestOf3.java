public class a028PrintTheLargestOf3 {
    public static void main(String[] args) {
        int a=1,b=3,c=6;
        if((a>=b)&&(a>=c)){
            System.out.println("largest is A");

        }
        else if(b>=c){
            System.out.println("largest is B");
        }
        else{
            System.out.println("largest is C");
        }
    }
}
