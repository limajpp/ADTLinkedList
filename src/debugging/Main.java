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

            linkedList.insertAtEnd(3);
            linkedList.insertAtEnd(4);

            System.out.println(linkedList);

            linkedList.insertAtIndex(2, 19);
            linkedList.insertAtIndex(2, 78);

            System.out.println(linkedList);

            linkedList.removeAtStart();

            System.out.println(linkedList);

            linkedList.removeAtEnd();
            linkedList.removeAtEnd();

            System.out.println(linkedList);
        }
        catch (Exception exception) {
            System.err.println(exception.getMessage());
        }
    }
}
