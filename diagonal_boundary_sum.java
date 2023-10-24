public class diagonal_boundary_sum {

    public static int firstDiagonalSum(int arr[][], int n) {
        int diagonalSum = 0;
        int cols=0;
        int rows=0;
        while (cols < n && rows < n) {
            diagonalSum+=arr[cols][rows];
            cols++;
            rows++;
        }
        return diagonalSum;
    }

    public static int secondDiagonalSum(int arr[][], int n) {
        int diagonalSum = 0;
        int cols=0;
        int rows=0;
        while (rows < n && cols >= 0) {
            diagonalSum+=arr[cols][rows];
            rows++;
            cols--;
        }
        return diagonalSum;
    }

    public static int boundarySum(int arr[][], int n) {
        int sum=0;
        for (int i = 1; i < n-1; i++) {
            sum+=arr[0][i];  //  upper part
            sum+=arr[n-1][i]; // lower part
            sum+=arr[i][n-1];  //right part
            sum+=arr[i][0];  //left part

        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[][] = { { 8, 3, 7 }, { 9, 3, 0 }, { 7, 6, 1 } };
        int n = arr.length;
        int total_sum = 0;
        total_sum += firstDiagonalSum(arr, n) + secondDiagonalSum(arr, n) + boundarySum(arr, n);
        System.out.println(total_sum);
    }
}
