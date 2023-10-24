public class union_intersec {
    public static void main(String[] args) {
        int arr1[]={1, 2, 5, 6, 0, 3, 7};
        int arr2[]={2, 4, 5, 6, 8, 9, 14, 26, 15};
        int union[]=new int[20];
        int k=0;
        for(int i=0; i < arr1.length;i++){
            union[k]=arr1[i];
            k++;
        }
        for(int i=0; i < arr1.length; i++){
            for(int j=i; j < arr2.length;j++){
               if(union[j]!=arr2[j]){
                union[k]=arr2[j];
                k++;
               }
            }
        }
        for(int i=0;i < union.length;i++){
            System.out.println("union of arrays "+union[i]);
        }
    }
}
