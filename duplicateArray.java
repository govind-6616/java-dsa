import java.util.Arrays;

public class duplicateArray {
    public static void main(String[] args) {
        int arr[] = { 16, 20, 3, 200, 3, 16 };
        for(int i=0;i < arr.length;i++){
            for(int j=i+1; j< arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println("the duplicate num is "+arr[i]);
                }
            }
        }
        Arrays.sort(arr);
        for(int i=0;i < arr.length-1; i++){
            if(arr[i]==arr[i+1]){
                System.out.println("the duplicate num is "+arr[i]);
            }
        }
       
    }
    }

