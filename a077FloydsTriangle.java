public class a077FloydsTriangle {
    public static void FloydsTriangle(int n) {
    int counter =1;
        for (int i =1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.println(counter +" ");
            counter++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
      
      
        // Myway:-
        // int x=1;
        // for (int i = 0; i <5; i++) {
        //     for (int j = 0; j <i+1; j++) {
        //         System.out.print(x + " ");
        //         x++;
        //     }
        //     System.out.println();
        // }
    
        // Shradha didi
    }
}
