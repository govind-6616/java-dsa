public class spiral_matrix {
    public static void main(String[] args) {
        int arr[][] = { { 5, 5, 4, 2 }, { 7, 8, 1, 7 }, { 4, 8, 3, 0 }, { 8, 2, 0, 1 } };
        int count=0;
        int nRows=arr.length;
        int mCols=arr[0].length;
        int rowStart=0;
        int colStart=0;
        int numElms=mCols*nRows;
        while (count < numElms) {
            for (int i = colStart;count < numElms && i < mCols; i++) {
                System.out.println(arr[rowStart][i]);
                count++;
            }
            rowStart++;
            for (int i = rowStart;count < numElms && i < nRows; i++) {
                System.out.println(arr[i][mCols-1]);
                count++;
            }
            mCols--;

            for (int i = mCols-1;count < numElms && i >= colStart; i--) {
                System.out.println(arr[nRows-1][i]);
                count++;
            }
            nRows--;
            for (int i = nRows-1;count < numElms && i >= rowStart; i--) {
                System.out.println(arr[i][colStart]);
                count++;
            }
            colStart++;
        }
    }
}
