public class remove_consecutive_duplicate {

    public static String removeFunction(String str){
        String output="";
        int startIndex=0;
        int n=str.length();
        while (startIndex < n) {
            char uniqChar=str.charAt(startIndex);
            int uniqIndex=startIndex+1;
            while (uniqIndex < n && str.charAt(uniqIndex)==uniqChar) {
                uniqIndex+=1;
            }
            output+=uniqChar;
            startIndex=uniqIndex;
        }
       
        return output;
    }

    public static void main(String[] args) {
        String str="aabbcggca";
        System.out.println(removeFunction(str));
    }
}