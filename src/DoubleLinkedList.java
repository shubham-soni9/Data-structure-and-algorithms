public class DoubleLinkedList {

    private Node head;

    static class Node {
        int data;
        Node prev;
        Node next;

        public Node(int data, Node prev, Node next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }
    }

    public void insertAtBeginning(int data) {
        if (head == null) {
            head = new Node(data, null, null);
        } else {
            Node newNode = new Node(data, null, null);
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void insertAtEnd(int data) {
        if (head == null) {
            head = new Node(data, null, null);
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = new Node(data, temp, null);
        }
    }

    public void insertAtPosition(int data, int position) {
        if (position < 0) {
            System.out.println("Invalid Position");
            return;
        }
        if (head == null) {
            if (position > 0) {
                System.out.println("Invalid Position");
            } else {
                head = new Node(data, null, null);
            }
        } else {
            Node temp = head;
            Node prev = temp;

            int count = 0;
            while (temp.next != null && count < position) {
                prev = temp;
                temp = temp.next;
                count++;
            }
            if (count == position) {
                Node newNode = new Node(data, null, null);
                newNode.prev = prev;
                newNode.next = temp;
                prev.next = newNode;
                temp.prev = newNode;
            } else {
                System.out.println("Position Not Found");
            }
        }
    }

    public void deleteFromBeginning() {
        if (head == null) {
            System.out.println("List is Already Empty");
        } else {
            if (head.next != null) {
                head.next.prev = null;
            }
            head = head.next;
        }
    }

    public void deleteFromEnd() {
        if (head == null) {
            System.out.println("List is Empty Already");
        } else {
            Node temp = head;
            if (head.next == null) {
                head = null;
            } else {
                Node prev = temp;
                while (temp.next != null) {
                    prev = temp;
                    temp = temp.next;
                }
                prev.next = null;
            }
        }
    }

    public void traverse() {
        System.out.println();
        if (head == null) {
            System.out.println("List is Empty");
        } else {
            Node temp = head;

            while (temp != null) {
                System.out.print("->" + temp.data);
                temp = temp.next;
            }
        }
    }

}
