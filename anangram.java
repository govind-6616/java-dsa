import java.util.Arrays;

public class anangram {
    public static void main(String[] args) {
        String str1="abdc";
        String str2="adcc";
        char arr1[]=str1.toCharArray();
        char arr2[]=str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(arr1.length!=arr2.length){
            System.out.println("not anangram");
        }
        for (int i = 0; i < arr2.length; i++) {
            if(arr1[i]!=arr2[i]){
                System.out.println("not anagram");
            }
            else{
                System.out.println("yes anangram");
            }
        }
        // int count=0;
        // for (int i = 0; i < str1.length(); i++) {
        //     for (int j = 0; j < str2.length(); j++) {
        //         if(str1.charAt(i) == str2.charAt(j)){
        //             count+=1;
        //             break;
        //         }
        //     }
        // }
        // if(count ==str1.length())
        // System.out.println("Yes, Anangram");
        // else
        // System.out.println("Not, Anangram");
    }
}
