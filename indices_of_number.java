public class indices_of_number {
    public static void main(String[] args) {
        int arr[] = { 1, 5, 9, 5, 5, 0 };
        int output[] = new int[arr.length];
        int outputIndex = 0;
        int x = 5;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                output[outputIndex] = i;
                outputIndex++;
            }
        }
        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i]);
        }
    }
}
