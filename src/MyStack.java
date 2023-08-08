public class MyStack {
    Node top;

    static class Node {
        int data;
        Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public void push(int data) {
        if (top == null) {
            top = new Node(data, null);
        } else {
            top = new Node(data, top);
        }
    }


    public void traverse() {
        System.out.println();
        if (top == null) {
            System.out.println("Empty");
        } else {
            Node temp = top;
            while (temp != null) {
                System.out.print("->" + temp.data);
                temp = temp.next;
            }
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Not Item Found");
        } else {
            Node item = top;
            top = top.next;
            return item.data;
        }
        return -1;
    }

    public boolean isEmpty() {
        return top == null;
    }
}
