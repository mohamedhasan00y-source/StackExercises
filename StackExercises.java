package CA241;
import java.util.Stack;

public class StackExercises {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Java");
        stack.push("Python");
        stack.push("C++");
        stack.push("JavaScript");
        stack.push("Go");
        System.out.println("Stack: " + stack);
        System.out.println("Top element: " + stack.peek());

        System.out.println("Popped element: " + stack.pop());
        System.out.println("Remaining Stack: " + stack);

        System.out.println("Is Stack Empty? " + stack.isEmpty());

        System.out.println("\n--- String Reversal ---");
        String original = "Hello World";

        Stack<Character> charStack = new Stack<>();
        for (int i = 0; i < original.length(); i++) {
            charStack.push(original.charAt(i));
        }
        String reversed = "";
        while (!charStack.isEmpty()) {
            reversed += charStack.pop();
        }
        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);

        System.out.println("\n--- Balanced Brackets ---");

        String balanced = "({[()]})";
        String unbalanced = "({[})";

        System.out.println(balanced + " : " + isBalanced(balanced));
        System.out.println(unbalanced + " : " + isBalanced(unbalanced));
    }
    public static boolean isBalanced(String expression) {
        Stack<Character> brackets = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                brackets.push(ch);
            }
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (brackets.isEmpty()) {
                    return false;
                }
                char top = brackets.pop();
                if (ch == ')' && top != '(') {
                    return false;
                }
                if (ch == '}' && top != '{') {
                    return false;
                }
                if (ch == ']' && top != '[') {
                    return false;
                }
            }
        }
        return brackets.isEmpty();
    }
}