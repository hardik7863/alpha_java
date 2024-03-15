import java.util.*;
public class a096KadanesAlgorithm {
// if all the array elements are negative then only add this line of code
    public static boolean AllnegativeElement(int numbers[]){
       
        for (int i = 0; i < numbers.length; i++) {
           if(numbers[i]>0){
            return false;
           }
        }
        return true;
    }



    public static void kadanes(int numbers[]){
        int ms=Integer.MIN_VALUE;
        int cs=0;
        boolean ele=AllnegativeElement(numbers);
        if (ele) {
            int smallest= Arrays.stream(numbers).max().getAsInt();
            System.out.println("the max sum is ="+ smallest);
        }
        
        else{
        for (int i = 0; i < numbers.length; i++) {
         cs=cs+numbers[i];
         if (cs<0) {
            cs=0;
         }       
         ms=Math.max(cs,ms);    
        }
       
        System.out.println("max sum is:"+ms);
    }

    }
 public static void main(String[] args) {
    int num[]={-1,-2,-3,-4};
    kadanes(num);
 }   
}
