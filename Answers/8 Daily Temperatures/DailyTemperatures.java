import java.util.Stack;

public class DailyTemperatures {
    public static int[] daily(int[] temperatures)
    {
        int[] result=new int[temperatures.length];
        Stack<Integer> stack=new Stack<>();
        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[i]>temperatures[stack.peek()])
            {
                int a=stack.pop();
                result[a]=i-a;
            }
            stack.push(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] t={73,74,75,71,69,72,76,73};
        int[] h=daily(t);
        for (int day:h)
        {
            System.out.print(day+" ");
        }
    }
}
