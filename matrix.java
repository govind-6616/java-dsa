public class matrix {       
    public static void main(String[] args) {
        int A[][]={{7,5,3},{8,1,0},{2,8,3}};
        int B[][]={{12,1,4},{1,13,0},{8,6,7}};
        int C[][]=new int[3][3];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                C[i][j]=A[i][j]+B[i][j];
            }
        }

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                
            }
        }

        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C.length; j++) {
               System.out.println("the sum of matrix is "+C[i][j]);   
            }
        }
    }
}
