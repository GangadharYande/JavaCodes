public class InverterHalfPyramid {
    public static void main(String[] args) {
        int n = 4;
        // Outer Loop
        for (int i = 1; i <= n; i++) {
            // inner Loop
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
