public class two_sum {
    public static void main(String[] args) {
        int arr[]={3,5,1,9,4,-2,6,7};
        int sum=7;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]+arr[j]==sum){
                    System.out.println("the numbers are "+arr[i]+" and "+arr[j]);
                }
            }
        }
    }
}
