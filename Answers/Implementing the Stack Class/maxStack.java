import java.util.Stack;

public class maxStack {
    private Stack<Integer> stack;
    private Stack<Integer> maxStack;

    public maxStack()
    {
        stack=new Stack<>();
        maxStack=new Stack<>();
    }
    public void push(int item)
    {
        stack.push(item);
        if (maxStack.isEmpty()||item>= maxStack.peek()){
            maxStack.push(item);
        }
    }
    public int pop()
    {
        if (stack.isEmpty())
        {
            return -1;
        }
        int popp=stack.pop();
        if (popp==maxStack.peek())
        {
            maxStack.pop();
        }
        return popp;
    }
    public int peek()
    {
        if (stack.isEmpty())
        {
            return -1;
        }
        return stack.peek();
    }
    public boolean isEmpty()
    {
        return stack.isEmpty();
    }
    public int getmax()
    {
        if (maxStack.isEmpty())
        {
            return -1;
        }
        return maxStack.peek();
    }

}
