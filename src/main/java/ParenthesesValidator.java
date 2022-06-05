import java.util.Stack;

public class ParenthesesValidator {

    private static final Character[][] bracketPairs = {{'(', ')'}, {'[', ']'}, {'{', '}'}};

    public static boolean isValidParentheses(String parenthesesString) {
        if (parenthesesString == null || parenthesesString.isEmpty()) return false;
        Stack<Character> stack = new Stack<>();

        for (Character ch : parenthesesString.toCharArray()) {
            if (isOpenBracket(ch)) {
                stack.push(ch);
            } else {
                if (!hasPair(stack.pop(), ch)) return false;
            }
        }
        return stack.isEmpty();
    }

    private static boolean isOpenBracket(Character ch) {
        for (Character[] pair : bracketPairs) {
            if (pair[0].equals(ch)) return true;
        }
        return false;
    }

    private static boolean hasPair(Character openBracket, Character ch) {
        for (Character[] pair : bracketPairs) {
            if (pair[0].equals(openBracket)) {
                return pair[1].equals(ch);
            }
        }
        return false;
    }
}
