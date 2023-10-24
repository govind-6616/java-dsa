import java.util.Arrays;

public class k_smallest_greatest {
    public static void main(String[] args) {
        int arr[]={5,7,7,3,1,1,9,11,8,10};
        int k=2;
        Arrays.sort(arr);
        System.out.println(arr[arr.length-k]);
        System.out.println(arr[k-1]);
    }
}
