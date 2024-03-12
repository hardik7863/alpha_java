import java.util.*;
public class a089LargestElement {
    public static int largestNum(int number[], int largest,int smallest){
     for (int i = 0; i < number.length; i++) {
        if (largest<number[i]) {
            largest=number[i];
        }
        if (smallest>number[i]) {
            smallest=number[i];
        }
     }
     System.out.println("smallest number is:"+ smallest);
     return largest;
    }
    public static void main(String[] args) {
        int number[] ={1,2,6,2,5};
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        System.out.println("largest number is"+largestNum(number,largest,smallest));
    }
}
