public class missing_num_arr {
    public static void main(String[] args) {
        int arr[]={1,2,3,5,7};
        int diff;
        for(int i=0;i < arr.length-1;i++){
            if(!(arr[i+1]==arr[i]+1)){
                 diff=arr[i+1]-arr[i];
                 int num=arr[i]+diff-1;
                //  int num=(arr[i+1]+arr[i])/2;
                 System.out.println("the missing number is "+num);
            }
        }
    }
}
