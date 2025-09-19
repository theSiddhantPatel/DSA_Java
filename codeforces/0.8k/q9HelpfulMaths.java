import java.util.Stack;

public class q9HelpfulMaths {

    public static void main(String[] args) {
        String str = "1+2+3";
        try {
            int result = evaluateExpression(str);
            System.out.println(result); // Output: Result: 6
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int evaluateExpression(String expression) {
        Stack<Integer> numbers = new Stack<>();
        // Stack<Character> operators = new Stack<>();
        int num = 0;

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            }
            // char prevSign = '+';
            // if (!Character.isDigit(ch) || i == expression.length() - 1) {
            // if (prevSign == '+') {
            // numbers.push(num);
            // } else if (prevSign == '-') {
            // numbers.push(-num);
            // } else if (prevSign == '*') {
            // numbers.push(numbers.pop() * num);
            // } else if (prevSign == '/') {
            // numbers.push(numbers.pop() / num);
            // }
            // num = 0;
            // prevSign = ch;
            // }
        }

        int result = 0;
        while (!numbers.isEmpty()) {
            result += numbers.pop();
        }
        return result;
    }
}
