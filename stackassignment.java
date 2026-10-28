import java.util.Stack;

class Solution {

    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            if (!stack.isEmpty() && stack.peek() == current) {
                stack.pop();
            } else {
                stack.push(current);
            }
        }

        StringBuilder result = new StringBuilder();

        for (Character ch : stack) {
            result.append(ch);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        String[] tests = {
                "abbaca",
                "azxxzy",
                "abcd",
                "aabbcc"
        };

        for (String input : tests) {
            System.out.println("Input: " + input);
            System.out.println(
                    "Output: " + solution.removeDuplicates(input)
            );
            System.out.println();
        }
    }
}