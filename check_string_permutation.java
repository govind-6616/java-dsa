public class check_string_permutation {

    public static boolean checkString(String s1,String s2){
        if(s1.length()!=s2.length())
        return false;
        int freq[]=new int[255];
        for (int i = 0; i < freq.length; i++) {
            freq[i]=0;
        }
        for (int i = 0; i < s1.length(); i++) {
            char ch=s1.charAt(i);
            ++freq[ch];
        }
        for (int i = 0; i < s2.length(); i++) {
             char ch=s2.charAt(i);
            --freq[ch];
        }
        for (int i = 0; i < freq.length; i++) {
            if(freq[i]!=0)
            return false;  
        }
        return true;
    }
    public static void main(String[] args) {
        String str1="abcd";
        String str2="baad";
        System.out.println(checkString(str1, str2));
    }
}
