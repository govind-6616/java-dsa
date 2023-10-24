public class majorityElm {
    public static void main(String[] args) {
        int arr[] = { 5, 7, 2, 5, 5, 2, 1, 3, 5, 5 };
        int count = 0;
        int i, j = 0;
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    break;
                }
            }
        }
        if (count >= arr.length / 2) {
            System.out.println("the majority elm is " + arr[j]);
        } else {
            System.out.println("no majority elm found");
        }
    }
}
