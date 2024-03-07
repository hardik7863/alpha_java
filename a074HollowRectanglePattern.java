public class a074HollowRectanglePattern {
    public static void pattern(int toRows, int toColumns){

        for (int i = 1; i <=toRows; i++) {
            for (int j = 1; j <=toColumns; j++) {
                if (i==1|| i== toRows || j==1 || j==toColumns) {
                    System.out.print("*");//boundary condition
                }
                else{
                    System.out.print(" ");
                }   }
                System.out.println();        
            }

        }
    
    public static void main(String[] args) {
        
        //My way;-
        // for (int i = 0; i < 4; i++) {
        //     for (int j = 0; j < 5; j++) {
        //         if ((i==1||i==2)&&(j==1|| j==2||j==3)) {
        //             System.out.print(' ');
        //             continue;
        //         }
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
    

        //Shradha didi ;-

       pattern(4,5);
    }
}
