public class main {
    public static void main(String[] args) {

        maxStack stack=new maxStack();
        stack.push(100);
        stack.push(10);
        stack.push(20);
        System.out.println(stack.getmax());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());

    }
}
