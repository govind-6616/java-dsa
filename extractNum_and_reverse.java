public class extractNum_and_reverse {
    public static void main(String[] args) {
        String str="a123";
        String rev="";
        int rem=0;
        int res=0;
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if(Character.isDigit(ch)){
                rev=rev+ch;
            }
        }
        int num=Integer.parseInt(rev);
        while (num > 0) {
            rem=num%10;
            res=rem+res*10;
            num=num/10;
        }
        System.out.println("output "+res);
    }
}
