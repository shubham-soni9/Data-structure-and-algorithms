
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        SingleLinkedList linkedList = new SingleLinkedList();
        linkedList.insertAtEnd(10);
        linkedList.insertAtEnd(20);
        linkedList.insertAtEnd(30);
        linkedList.insertAtEnd(40);
        linkedList.insertAtEnd(50);

        linkedList.traversing();

        linkedList.deleteLast();
        linkedList.traversing();

        linkedList.deleteLast();
        linkedList.traversing();

        linkedList.deleteLast();
        linkedList.traversing();

        linkedList.deleteLast();
        linkedList.traversing();

        linkedList.deleteLast();
        linkedList.traversing();

        linkedList.deleteLast();
        linkedList.traversing();
    }
}