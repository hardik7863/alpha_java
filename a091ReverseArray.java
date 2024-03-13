public class a091ReverseArray {
    //Shradha didi
    public static void reverse(int numbers[]){
        int first=0 ,last=numbers.length-1;
        while (first<last) {
            //swap
            int temp=numbers[last];
            numbers[last]=numbers[first];
             numbers[first]=temp;
             first++;
             last--;

        }
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        reverse(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]+" ");
        }
        System.out.println();
    }
   



    //my way:-
    // public static void reverseArray(int arr []){
    //     for (int i = 0; i < arr.length/2; i++) {
    //         int temp=arr[arr.length-1-i];
    //         arr[arr.length-1-i]=arr[i];
    //         arr[i]=temp;
    // }}
    // public static void main(String[] args) {
    //     int arr[]={2,4,6,8,10};
    //     reverseArray(arr);
        
    //     for (int i = 0; i < arr.length; i++) {
    //         System.out.println(arr[i]);
    //     }
    // }
}

