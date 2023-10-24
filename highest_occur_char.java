public class highest_occur_char {

    public static void highestChar(String str){
         int max=-1;
        char ch;
        int freq[]=new int[256];
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }
        for (int i = 0; i < freq.length; i++) {
            if(max < freq[str.charAt(i)]){
                max=freq[str.charAt(i)];
                ch=str.charAt(i);
                System.out.println(ch);
            }
        }
        
    }
    public static void main(String[] args) {
        String str="bccdcbbbbbba";
     highestChar(str);
    }
}
