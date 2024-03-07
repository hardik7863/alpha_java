class a075InvertedAndRotatedHalfPyramid {
    public static void invertedandrotatedhalfpyramid(int n) {
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
        System.out.println();
        }
    }
    public static void main(String[] args) {
       
        //My way;-
        // for (int i = 0; i <4; i++) {
        //     for (int j = 0; j < 4; j++) {
        //         if (i+j>=3) {
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        //Shradha didi
        invertedandrotatedhalfpyramid(4);
    }
}