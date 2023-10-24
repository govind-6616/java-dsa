import java.util.Scanner;

public class no_of_occur_arr {
    public static void main(String[] args) {
        int arr[]={5,7,1,7,9};
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter elm to find occurenence in array");
        int n=sc.nextInt();
        for(int i=0;i < arr.length;i++){
            if(arr[i]==n){
                count+=1;
            }
        }
        if(count > 0){
            System.out.println("elm occured "+count+" times");
        }
        else{
            System.out.println("no elm found");
        }
    }
}
