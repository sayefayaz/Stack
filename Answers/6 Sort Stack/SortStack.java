import javax.imageio.stream.IIOByteBuffer;
import java.util.Stack;

public class SortStack {
    public static Stack<Integer> sortStack(Stack<Integer> stack)
    {
        Stack<Integer> tempStack=new Stack<>();
        while (!stack.isEmpty())
        {
            int temp=stack.pop();
            while (!tempStack.isEmpty()&&tempStack.peek()>temp)
            {
                stack.push(tempStack.pop());
            }
            tempStack.push(temp);
        }
        return tempStack;
    }

    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(4);

        Stack<Integer> sorted=sortStack(stack);
        System.out.println(sorted.pop());
        System.out.println(sorted.pop());
    }
}
