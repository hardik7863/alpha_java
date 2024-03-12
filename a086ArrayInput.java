import java.util.*;

public class a086ArrayInput {
 public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int marks[]= new int[50];

    //length of array
    System.out.println("length of array is:"+ marks.length);


    marks[0] = sc.nextInt();
    marks[1] = sc.nextInt();
    marks[2] = sc.nextInt();
    System.out.println("phy marks is"+marks[0]);
    System.out.println("chem marks is"+marks[1]);
    System.out.println("maths marks is"+marks[2]);
    marks[2]=100;
    System.out.println("maths marks is"+marks[2]);

    int per=(marks[0]+marks[1]+marks[2])/3;
    System.out.println("percentage is:" +per+"%");
    
 }   
}
