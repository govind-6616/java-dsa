public class reverseWords {

    public static String reverse(String str, int start, int end) {
        char arr[] = str.toCharArray();
        char ch;
        while (start <= end) {
            ch = arr[end];
            arr[end] = arr[start];
            arr[start] = ch;
            start++;
            end--;
        }
        return String.valueOf(arr);
    }

    public static String revWord(String str) {
        int i = 0;
        int len = str.length() - 1;
        for (int k = 0; k <= len; k++) {
            if (str.charAt(k) == ' ') {
                str = reverse(str, i, k - 1);
                i = k + 1;
            }
            if (k == len) {
                str = reverse(str, i, len);
            }
        }
        return str;
    }

    public static void main(String[] args) {
        String str = "abc de f gh";
        String newStr = revWord(str);
        for (int i = 0; i < newStr.length(); i++) {
            System.out.println(newStr.charAt(i));
        }
    }
}
