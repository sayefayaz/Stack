import java.util.Stack;

public class InfixToPostfix {
    public static String infixtopostfix(String infix)
    {
        StringBuilder postfix=new StringBuilder();
        Stack<Character> stack=new Stack<>();
        for (int i = 0; i < infix.length(); i++) {
            char c=infix.charAt(i);
            if (Character.isDigit(c))
            {
                postfix.append(c);
                while (i+1<infix.length()&&(Character.isDigit(infix.charAt(i+1))||infix.charAt(i+1)=='.'))
                {
                    postfix.append(infix.charAt(++i));
                }
                postfix.append(' ');
            } else if (c=='(') {
               stack.push(c);

            } else if (c==')') {
                while (!stack.isEmpty()&&stack.peek()!='(')
                {
                    postfix.append(stack.pop()).append(' ');
                }
                stack.pop();

            }
            else {
                while (!stack.isEmpty()&&precedence(c)<=precedence(stack.peek()))
                {
                    postfix.append(stack.pop()).append(' ');
                }
                stack.push(c);
            }
        }
        while (!stack.isEmpty())
        {
            postfix.append(stack.pop()).append(' ');
        }
        return postfix.toString().trim();
    }

    private static int precedence(char operator)
    {
        if (operator=='+'||operator=='-')
        {
            return 1;
        } else if (operator=='*'||operator=='/') {
            return 2;

        }
        return 0;
    }

    public static void main(String[] args) {
        String a="3 + 4 * 2 / ( 1 - 5 )";
        System.out.println(infixtopostfix(a));
    }
}
