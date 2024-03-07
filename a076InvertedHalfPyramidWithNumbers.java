public class a076InvertedHalfPyramidWithNumbers {
    public static void invertedhalfpyramidwithnumber(int n){
        for (int i = 1; i <=n; i++) {
            int x=1;
            for (int j = 1; j<=n-i+1; j++) {
                System.out.print(j + " ");
            }
        System.out.println();}
    }
    public static void main(String[] args) {
       
       
        //Myway:-
        // for (int i = 0; i < 5; i++) {
        //     int x=1;
        //     for (int j = 0; j < 5; j++) {
        //         if(i+j<=4){
        //             System.out.print(x);
        //             x++;
        //                 } 
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //  System.out.println();                    
    // }

    //Shradha didi
    invertedhalfpyramidwithnumber(5);

}}
