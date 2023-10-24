public class two_equal_sum_subarray {
    public static void main(String[] args) {
        int arr[] = { 4, 3, 2, 1 };
        int left_sum = 0;
        int right_sum = 0;
        int split_index = 0;
        for (int i = 0; i < arr.length; i++) {
            left_sum += arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                right_sum += arr[j];
                  if (left_sum == right_sum) {
                split_index = i + 1;
            }
            }
          
        }
        // split_index = -1;
        if (split_index == -1 || split_index == arr.length) {
            System.out.println("not possible");
        }
        for (int i = 0; i < arr.length; i++) {
            if (split_index == i) {
                System.out.println();
            }
            System.out.print(arr[i]+" ");
        }

    }
}
