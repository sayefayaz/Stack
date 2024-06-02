import java.util.Stack;

public class Balanced {
    public static boolean isBalanced(String input)
    {
        Stack<Character> stack=new Stack<>();
        for (char c: input.toCharArray())
        {
            if (c=='(' || c=='[' || c=='{' )
            {
                stack.push(c);

            }
            else if (c==')'  || c==']' || c=='}')
            {
                if (stack.isEmpty())
                {
                    return false;
                }
                char openingBracket=stack.pop();
                if ((c==')' && openingBracket!='(')
                    ||
                (c==']' && openingBracket!='[')
                ||
               (c=='}' && openingBracket!='{'))
                {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isBalanced("{[()]}"));
        System.out.println(isBalanced("({[)"));
    }
}
