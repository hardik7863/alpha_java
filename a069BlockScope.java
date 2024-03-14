public class a069BlockScope {
    public static void main(String[] args) {
        int p=10;
        //Block Scope
        {
          int s =45;
          System.out.println(p);
        }
        //System.out.println(s);  this will give error becoz your calling
        // variable s out of its block scope
        System.out.println(p);
        //another example
        for (int i = 0; i <=5; i++) {
            
        }
        // System.out.println(i  );
    }
}
