public class wave_Matrix {
    public static void main(String[] args) {
        int arr[][] = { { 5, 5, 4, 2 }, { 7, 8, 1, 7 }, { 4, 8, 3, 0 }, { 8, 2, 0, 1 } };
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < arr.length; j++) {
                    System.out.print(arr[j][i]);
                }
            } else {
                for (int j = arr.length - 1; j >= 0; j--) {
                    System.out.print(arr[j][i]);
                }
            }

            System.out.println("");
        }
    }
}
