public class Main {
    public static void main(String[] args) {
        LinkedList stack = new LinkedList();

        // Pushing elements onto the stack
        // Here we used .add()
        stack.add(70); // 70 will be added first
        stack.add(30); // 30 will be added after 70
        stack.add(56); // 56 will be added at last so according to LIFO it is on top

        // Print the stack
        System.out.println("Stack Sequence, after Push() (.add() of LinkedList)");
        stack.printStack(); // Output: 56 30 70

    }
}