public class rowWiseSum {
    public static void main(String[] args) {
        int arr[][]={{2,4},{3,6},{8,1}};
        for (int i = 0; i < arr.length; i++) {
            int sum=0;
            for (int j = 0; j < arr[0].length; j++) {
                sum+=arr[i][j];
            }
            System.out.println(sum);
        }
    }
}
