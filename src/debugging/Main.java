package debugging;

import entities.ADTIntegerLinkedList;

public class Main {
    public static void main(String[] args) {
        // Debugging...
        try {
            ADTIntegerLinkedList linkedList = new ADTIntegerLinkedList();

            System.out.println(linkedList.isEmpty());

            System.out.println();

            linkedList.insertAtStart(1);
            linkedList.insertAtStart(2);

            System.out.println(linkedList);

            System.out.println();

            linkedList.insertAtEnd(3);
            linkedList.insertAtEnd(4);

            System.out.println(linkedList);

            System.out.println();
        }
        catch (Exception exception) {
            System.err.println(exception.getMessage());
        }
    }
}
