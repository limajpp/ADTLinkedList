package debugging;

import entities.ADTIntegerLinkedList;

public class Main {
    public static void main(String[] args) {
        // Debugging...
        try {
            ADTIntegerLinkedList linkedList = new ADTIntegerLinkedList();

            System.out.println(linkedList.isEmpty());

            linkedList.insertAtStart(1);
            linkedList.insertAtStart(2);

            System.out.println(linkedList);

            linkedList.insertAtEnd(3);
            linkedList.insertAtEnd(4);

            System.out.println(linkedList);
        }
        catch (Exception exception) {
            System.err.println(exception.getMessage());
        }
    }
}
