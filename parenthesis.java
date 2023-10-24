import java.util.Stack;

public class parenthesis {

    static boolean isOpeningBracket(char c) {
        if (c == '(' || c == '{' || c == '[') {
            return true;
        } else {
            return false;
        }
    }

    static boolean isMatching(char a, char b) {
        if ((a == '(' && b == ')') || (a == '{' && b == '}') || (a == '[' && b == ']')) {
            return true;
        } else {
            return false;
        }
    }

    static boolean isParenthesisMatching(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (isOpeningBracket(c)) {
                s.push(c);
            } else {
                if (s.isEmpty()) {
                    return false;
                } else if (!isMatching(s.peek(), c)) {
                    return false;
                } else {
                    s.pop();
                }
            }

        }
        return s.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isParenthesisMatching("({})"));
    }
}
