public class rotateArray {
    public static void main(String[] args) {
        int d = 2;
        int i, j;
        int k = 0;
        int arr[] = { 1, 2, 3, 4, 5 };
        for (int a = 0; a < arr.length; a++) {
            System.out.println("initially rotation " + arr[a]);
        }
        for (i = 0; i < d; i++) {
            int temp = arr[k];
            for (j = k; j < 4; j++) {
                arr[j] = arr[j + 1];
            }
            arr[j] = temp;
        }
        for (int a = 0; a < arr.length; a++) {
            System.out.println("after rotation " + arr[a]);
        }

        int temp[] = new int[arr.length];
        int c = 0;
        for (int p = d; i < arr.length; i++) {
            temp[c] = arr[p];
            c++;
        }
        for (int q = 0; q < d; q++) {
            temp[c] = arr[q];
            c++;
        }
        for (int x = 0; x < arr.length; x++) {
            System.out.println("after : " + arr[x]);
        }
    }
}
