public class a093PrintSubarray {
    public static void printSubarray(int arr[]){
        int ts=0;
        for (int i = 0; i < arr.length; i++) {
            int start=i;
        
        for (int j = i; j < arr.length; j++) {
            int end=j;
            for (int k =start; k <=end; k++) {
                System.out.print(arr[k]+" ");

            } ts++;
            System.out.println();
        }
    System.out.println();
// sum n=n(n+1)/2;
}
System.out.println("total subarray is=" +ts);
    } 
    public static void main(String[] args) {
        int numbers []={2,4,6,8,10};
        printSubarray(numbers);
    }
}
