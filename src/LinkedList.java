class LinkedList {
    Node head;  // Front of the Queue
    Node rear;  // Rear of the Queue

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            // If the queue is empty, both head and rear point to the new node
            head = rear = newNode;
            return;
        }
        rear.next = newNode;  // Link the new node after the current rear
        rear = newNode;  // Updating the rear
    }


    public void printQueue() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}
