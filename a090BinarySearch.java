//Time complexcity o(logn);
public class a090BinarySearch {
    public static int Binarysearch(int number [], int key){
        int start=0;
        int end=number.length-1;
        
        for (int i = start; i < end; i++) {
            int mid =(start+end)/2;
            if(key==number[mid]){
                return mid;
            }
            else if(key>number[mid]){
             start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return-1;
    }
   public static void main(String[] args) {
    int number[]={2,4,6,8,10,12,14};
    int key=10;
    int index=Binarysearch(number, key);
    if (index==-1) {
        System.out.println("Not Found");
    }
    else{
        System.out.println("index is:"+ index);
    }
   }
}
