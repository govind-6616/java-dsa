public class maxMinArray {
    public static void main(String[] args) {
        int arr[] = { 11, 11, 1, 11, 120, 11, 11 };
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            
        }
    }
     System.out.println("Max " + max + " Min " + min);
    }
}
