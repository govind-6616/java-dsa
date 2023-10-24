public class matrixSearch {
    public static void main(String[] args) {
        int arr[][] = { { 7, 10, 12 }, { 18, 22, 122 }, { 124, 223, 2220 } };
        int x = 22;
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr.length; j++) {
        //         if (arr[i][j] == x) {
        //             System.out.println("the elm found at position " + i + " " + j);
        //         }
        //     }
        // }
// for sorted array only------
        int l=0;
        int r=arr.length-1;
        while (l < r && r >=0) {
            if(arr[l][r]==x){
                System.out.println("the element found at position "+l+" "+r);
            }
             if(arr[l][r] > x){
                r--;
            }
            else{
                l++;
            }
        }

    }
}
