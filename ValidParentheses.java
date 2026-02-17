import java.util.HashMap;
import java.util.Stack;

class SolutionValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (map.containsKey(c)) {

                char topStack;
                if (!stack.isEmpty()) {
                    // ambil nilai paling atas (LIFO)
                    topStack = stack.pop();

                } else {
                    // char ngawur
                    // buat penanda gagal
                    topStack = '#';
                }

                if (topStack != map.get(c)) {
                    return false;
                }
            } else {

                // masukin ke stack
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }
}

public class ValidParentheses {
    public static void main(String[] args) {
        SolutionValidParentheses solutionValidParentheses = new SolutionValidParentheses();
        String test1 = "()";
        String test2 = "()[]{}";
        String test3 = "(]";
        String test4 = "([)]";

        System.out.println("Test 1 " + test1 + " is " + solutionValidParentheses.isValid(test1));
        System.out.println("Test 2 " + test2 + " is " + solutionValidParentheses.isValid(test2));
        System.out.println("Test 3 " + test3 + " is " + solutionValidParentheses.isValid(test3));
        System.out.println("Test 4 " + test4 + " is " + solutionValidParentheses.isValid(test4));
    }
}