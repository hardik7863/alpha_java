public class a092PairsInArray {
    public static void printPairs(int numbers[]){
        int tp=0;
        for (int i = 0; i < numbers.length; i++) {
            int curr=numbers[i];
            for (int j = i+1; j < numbers.length; j++) {
                System.out.print("(" + curr + "," + numbers[j] + ")");
            tp++;}
            System.out.println();
        }
        System.out.println("total pairs are=" +tp);
        //1+2+3+4+..... =n(n-1)/2;
        //sum of n-1 numbers or Arithmetic progression

        //time complexity=o(n2)
    }
  //Shardha didi:-
 public static void main(String[] args) {
    int numbers[]={2,4,6,8,10};
    printPairs(numbers);
 }







 // my way:-   
//     public static void PairsInArray(int arr[]){
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i+1; j < arr.length; j++) {
//                 System.out.print("("+arr[i]+","+arr[j]+")"+ " ");
//             }
//             System.out.println();
//         }
//     }
//  public static void main(String[] args) {
//     int arr[]={2,4,6,8,10};
//     PairsInArray(arr);
    
 }   

