
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        DoubleLinkedList linkedList = new DoubleLinkedList();

        linkedList.insertAtBeginning(10);
        linkedList.traverse();
        linkedList.insertAtBeginning(9);
        linkedList.traverse();

        linkedList.insertAtBeginning(8);
        linkedList.traverse();

        linkedList.insertAtBeginning(7);
        linkedList.traverse();

        linkedList.insertAtBeginning(6);
        linkedList.traverse();

        linkedList.insertAtBeginning(5);
        linkedList.traverse();

        linkedList.insertAtEnd(11);
        linkedList.traverse();

        linkedList.insertAtEnd(12);
        linkedList.traverse();

        linkedList.insertAtEnd(14);
        linkedList.traverse();

        linkedList.insertAtEnd(16);
        linkedList.traverse();

        linkedList.insertAtPosition(40,2);
        linkedList.traverse();

        linkedList.deleteFromBeginning();
        linkedList.traverse();

        linkedList.deleteFromBeginning();
        linkedList.traverse();

        linkedList.deleteFromBeginning();
        linkedList.traverse();

        linkedList.deleteFromBeginning();
        linkedList.traverse();

        linkedList.deleteFromBeginning();
        linkedList.traverse();

        linkedList.deleteFromEnd();
        linkedList.traverse();
    }
}