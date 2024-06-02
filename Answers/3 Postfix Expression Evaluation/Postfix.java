import java.util.Stack;

public class Postfix {
    public static int postfix(String input)
    {
        Stack<Integer> stack=new Stack<>();
        String[] token=input.split(" ");

        for (String toke:token)
        {
            if (toke.matches("-?\\d+"))
            {
                stack.push(Integer.parseInt(toke));
            }
            else {
                int a=stack.pop();
                int b=stack.pop();
                switch (toke)
                {
                    case "+":
                        stack.push(a+b);
                        break;

                    case "-":
                        stack.push(a-b);
                        break;

                    case "*":
                        stack.push(a*b);
                        break;

                    case "/":
                        stack.push(a/b);
                        break;

                    default:
                        throw new IllegalStateException("invalid operator: "+toke);
                }
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        System.out.println(postfix("3 4 + 2 * 7 /"));
    }
}
