public class a051PrintHalfPyramidPattern {
    public static void main(String[] args) {
        int x=1;
        for (int i =0; i <4; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print(x);
                x++;
            }
            x=1;
        System.out.println();
        }

    }
}
