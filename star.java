public class star {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int k = n - i; k >= 0; k--) {
                System.out.print(" ");
            }
            // for (int j = 1; j <= 2*i-1; j++) {
                 for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
            for (int i = n-1; i >=1 ; i--) {
            for (int k = n - i; k >= 0; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
