public class a071PractiseQs {
    public static void Sum(int x){
        int sum=0;
        while(x>0){
        int ldigit=x%10;
        x=x/10;
        sum=sum+ldigit;
    }
   System.out.println("The sum is" + sum);
}
    public static void mathfunc(){

    }


    public static void Palindrome(int x){
        int y=x;
        int rev=0;
        while (x>0) {
            int temp=x%10;
            rev=(rev*10)+(temp);
            x=x/10;
        }
        if (y==rev) {
            System.out.println("given number " + y +" is palindrome");
            
        }
        else{
            System.out.println("no given no is not palidrome");
        }
    }


    public static boolean isEven(int x){
        if(x%2==0){
            return true;
        }
        return false;
    }

    
    public static void avg(int a ,int b,int c){
    int avg=(a+b+c)/3;
    System.out.println(avg);
    }



    public static void main(String[] args) {
        //q1  Write a Java method to compute the average of three numbers..
        avg(5,4,3);



        //Q2.Write a method named isEven that accepts an int argument. The method
        //should return true if the argument is even, or false otherwise. Also write a program to test your
        //method.
      System.out.println(isEven(2));


        //Q3. Write a Java program to check if a number is a palindrome in Java? ( 121 is a
        // palindrome, 321 is not)
        // A number is called a palindrome if the number is equal to the reverse of a number e.g., 121 is a
        // palindrome because the reverse of 121 is 121 itself. On the other hand, 321 is not a
        // palindrome because the reverse of 321 is 123, which is not equal to 321.
    
        int x=121;
        Palindrome(x);

        // Q4. Question 4 : READ & CODE EXERCISE
// Search about(Google) & use the following methods of the Math class in Java:
// a.  Math.min()
// b.  Math.max() // this wont work for arrays
// c.  Math.sqrt()
// d.  Math.pow()
// e.  Math.avg()//no idea doesnt exit
// f.  Math.abs()
      int j=2;
      int k=4;
      int l=6;
      int ar[]={2,4,5,7,8};
      System.out.println(Math.min(2,4));
      System.out.println(Math.max(j,k));
      System.out.println(Math.sqrt(l));
      System.out.println(Math.pow(j,2));
      System.out.println(Math.abs(4.8));
    
    
    
//Q5.Write a Java method to compute the sum of the digits in an integer.
// (Hint : Approach this question in the following way :
// a.  Take a variable sum = 0
// b.  Find the last digit of the number
// c.  Add it to the sum
// d.  Repeat a & b until the number becomes 0 )
      Sum(123);

}
}
