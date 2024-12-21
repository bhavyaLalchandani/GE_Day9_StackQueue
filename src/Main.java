public class Main {
    public static void main(String[] args) {
        // STACK
        // LinkedList stack = new LinkedList();
        // stack.add(70); // 70 will be added first
        // stack.add(30); // 30 will be added after 70
        // stack.add(56); // 56 will be added at last so according to LIFO

        // QUEUE
        LinkedList queue = new LinkedList();
        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);
        System.out.println("Queue after Enqueue of 3 elements:");
        queue.printQueue();
        queue.dequeue();
        System.out.println("Queue after one Dequeue operation:");
        queue.printQueue();

    }
}