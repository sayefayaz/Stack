import java.util.Stack;

public class LongestValidParentheses {
    public static int longestvalid(String s)
    {
        int maxLenght=0;
        Stack<Integer> stack=new Stack<>();
        stack.push(-1);

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='('){
                stack.push(i);
            }
            else {
                stack.pop();
                if (stack.isEmpty())
                {
                    stack.push(i);
                }
                else {
                    maxLenght=Math.max(maxLenght,i-stack.peek());
                }
            }
        }
        return maxLenght;
    }

    public static void main(String[] args) {
        String a="(()";
        String b=")()())";

        System.out.println(longestvalid(a));
        System.out.println(longestvalid(b));
    }
}
