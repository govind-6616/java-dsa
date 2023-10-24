public class pallindrome {

    static boolean isPallindrome(String str, int right, int left) {
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "racecar";
        int right = str.length() - 1;
        int left = 0;
        if (isPallindrome(str, right, left))
            System.out.println("yes string is pallindrome");
        else
            System.out.println("not a pallindrome");
    }
}
