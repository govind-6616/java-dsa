public class largestRowColm {
    public static void main(String[] args) {
        int arr[][]={{22,4},{23,6},{18,3}};
        int max=Integer.MIN_VALUE;
        boolean isRow=true;
        int num=0;
        for (int i = 0; i < arr.length; i++) {
            int rowSum=0;
            for (int j = 0; j < arr[0].length; j++) {
                rowSum+=arr[i][j];
                num=j;
            }
            if(max < rowSum){
                max=rowSum;
            }
        }
        for (int i = 0; i < arr[0].length; i++) {
            int colSum=0;
            for (int j = 0; j < arr.length; j++) {
                colSum+=arr[j][i];
                num=j;
            }
            if(max < colSum){
                max=colSum;
                isRow=false;
            }
        }
        if(isRow)
        System.out.println("row "+max+" "+num);
        else
        System.out.println("column "+max+" "+num);
    }
}
