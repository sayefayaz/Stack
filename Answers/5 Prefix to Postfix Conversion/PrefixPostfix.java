import java.util.Stack;

public class PrefixPostfix {
    public static String prefixtopostfix(String input)
    {
        Stack<String> stack=new Stack<>();

        String[] tokens=input.split(" ");
        for (int i = tokens.length-1; i>=0; i--) {
            String token=tokens[i];
            if (isOperator(token)){
                String a=stack.pop();
                String b=stack.pop();
                String newInput=a+" "+b+" "+token;
                stack.push(newInput);
            }
            else {
                stack.push(token);
            }
        }
        return stack.pop();
    }
    private static boolean isOperator(String token)
    {
        return token.equals("+")||token.equals("-")||token.equals("*")||token.equals("/");

    }

    public static void main(String[] args) {
        System.out.println(prefixtopostfix("* + 3 4 2"));
    }
}
