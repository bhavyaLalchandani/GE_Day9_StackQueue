class LinkedList {
    Node head;

    // Acts as push() method for the stack
    public void add(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    // Pop method for the Stack
    public void pop() {
        if (head == null) {
            System.out.println("Stack is already empty");
            return;
        }
        head = head.next;
    }

    // Peek method for the Stack
    public int peek() {
        if (head == null) {
            System.out.println("Stack is empty");
            return -1;
        }
        return head.data;
    }

    // Method to print the Stack
    public void printStack() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}
