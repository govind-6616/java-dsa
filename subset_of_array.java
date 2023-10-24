public class subset_of_array {
    public static void main(String[] args) {
        // int nums[]={1,2,3};
        char nums[]={'a','b','c'};
        int n = nums.length;
 
        for (int i = 0; i < (1 << n); i++) {
 
            for (int j = 0; j < n; j++) {
 
                if ((i & (1 << j)) != 0) {
 
                    System.out.print(nums[j] + " ");
                }
            }
 
            System.out.println();
        }
    
    }
}
