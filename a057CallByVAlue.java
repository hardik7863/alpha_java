public class a057CallByVAlue {

    //In java, we most of the time have call by value whereas in cpp most of them focus on call by reference


    public static void Swap(int a, int b){
    int temp=a;
    a=b;
    b=temp;
    System.out.println("a="+a);
    System.out.println("b="+ b);
    }
    public static void main(String[] args) {
     int a=5;
     int b=10;
     Swap(a,b);
    }
}
