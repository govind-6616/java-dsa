public class reverse_string {
    public static void main(String[] args) {
        String str="hello world";
        char ch;
        String rev="";
        for (int i = str.length()-1; i >=0; i--) {
            ch=str.charAt(i);
            rev=rev+ch;
        }
        System.out.println("the reverse of string is "+rev);
        // char arr[]=str.toCharArray();
        // System.out.println("the reverse of string is ");
        // for (int i = arr.length-1; i >= 0; i--) {
        //     System.out.print(" "+arr[i]);
        // }
    }
}
