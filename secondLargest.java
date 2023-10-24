public class secondLargest {
    public static void main(String[] args) {
        int arr[]={-1,1,-1,-1,-1};
        int firstLargest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for(int num:arr){
            if(num > firstLargest){
                secondLargest=firstLargest;
                firstLargest=num;
            }
            else if(num > secondLargest && num!=firstLargest){
                secondLargest=num;
            }
        }
        System.out.println("first "+firstLargest+" second "+secondLargest);
    }
}
