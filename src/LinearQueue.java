public class LinearQueue {

    Node front, rear;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Already Empty");
        } else {
            System.out.print("\nDequeue: " + front.data);
            front = front.next;
        }
        if (front == null) {
            rear = null;
        }
    }

    public void traverse() {
        System.out.println();
        Node temp = front;
        while (temp != null) {
            System.out.print("->" + temp.data);
            temp = temp.next;
        }
    }

    public boolean isEmpty() {
        return front == null;
    }

    public boolean isFull() {
        return front == rear;
    }

}
