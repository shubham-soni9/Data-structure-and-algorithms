public class SingleLinkedList {

    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public void insertAtBeginning(int data) {
        if (head == null) {
            head = new Node(data, null);
        } else {
            head = new Node(data, head);
        }
    }

    public void insertAtEnd(int data) {
        if (head == null) {
            head = new Node(data, null);
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(data, null);
        }
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("Delete First Empty");
        } else {
            head = head.next;
        }
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("Delete Last Empty");
        } else {
            if (head.next == null) {
                head = null;
            } else {
                Node temp = head;
                Node prev = null;

                while (temp.next != null) {
                    prev = temp;
                    temp = temp.next;
                }
                prev.next = null;
            }
        }
    }

    public void traversing() {
        System.out.println();

        if (head == null) {
            System.out.println("Traverse Empty");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print("->" + temp.data);
                temp = temp.next;
            }
        }
    }

}
