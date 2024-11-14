import java.util.Stack;

public class Valid_Parentheses {

    // --------------------------------------------------------------------------------------

    // Runtime : ~250000 NanoSecods
    static boolean isValid_1(String s) {
        char[] Characters = s.toCharArray();
        Stack<Character> Parentheses = new Stack<>();
        boolean AllParenthesesClosed = true;

        for (int i = 0; i < Characters.length; i++) {
            switch (Characters[i]) {
                case 40:
                    Parentheses.add(')');
                    AllParenthesesClosed = false;
                    break;

                case 91:
                    Parentheses.add(']');
                    AllParenthesesClosed = false;
                    break;

                case 123:
                    Parentheses.add('}');
                    AllParenthesesClosed = false;
                    break;

                default:
                    if (!Parentheses.empty() && Parentheses.peek() == Characters[i])
                        Parentheses.pop();
                    else
                        return false;
                    break;
            }
            if (Parentheses.empty())
                AllParenthesesClosed = true;
            else
                AllParenthesesClosed = false;
        }

        return AllParenthesesClosed;
    }

    // --------------------------------------------------------------------------------------

    // Runtime : ~8000 NanoSecods
    static boolean isValid_2(String s) {
        int i = -1;
        char[] p = new char[s.length()];
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                i++;
                p[i] = c;
            } else {
                if (i >= 0 && ((p[i] == '(' && c == ')') || (p[i] == '{' && c == '}') || (p[i] == '[' && c == ']')))
                    i--;
                else
                    return false;
            }
        }
        return i == -1;
    }

    // --------------------------------------------------------------------------------------

    public static void main(String[] args) {
        long startTime = System.nanoTime();

        boolean Result = isValid_1("{}([)]");

        long endTime = System.nanoTime();

        long ElapsedTime = endTime - startTime;
        System.out.println("Elapsed time in nanoseconds : " + ElapsedTime);

        System.out.println("result : " + Result);
    }
}