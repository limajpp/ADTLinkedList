package entities;

public class ADTIntegerLinkedList {
    private ADTIntegerNode start;
    private int elements;

    public ADTIntegerLinkedList() {
        start = null;
        elements = 0;
    }

    public boolean isEmpty() {
        return start == null;
    }

    public void insertAtStart(int element) {
        ADTIntegerNode newNode = new ADTIntegerNode(element);

        if (!isEmpty()) newNode.setNext(start);

        start = newNode;
        elements++;
    }

    public void insertAtEnd(int element) {
        ADTIntegerNode newNode = new ADTIntegerNode(element);

        if (isEmpty()) {
            insertAtStart(element);
        } else {
            ADTIntegerNode current = start;

            while (current.getNext() != null) {
                current = current.getNext();
            }

            current.setNext(newNode);
        }

        elements++;
    }

    public void insertAtIndex(int index, int element) {
        if (index < 0 || index > elements) throw new IndexOutOfBoundsException("Invalid index.");
        if (index == 0) {
            insertAtStart(element);
            return;
        }
        if (index == elements) {
            insertAtEnd(element);
            return;
        }

        ADTIntegerNode newNode = new ADTIntegerNode(element);
        ADTIntegerNode currentNode = start;

        for (int i = 0; i < index - 1; i++) {
            currentNode = currentNode.getNext();
        }

        newNode.setNext(currentNode.getNext());
        currentNode.setNext(newNode);

        elements++;
    }

    @Override
    public String toString() {
        StringBuilder linkedListString = new StringBuilder();
        ADTIntegerNode current = start;

        while (current != null) {
            linkedListString.append(current.getElement()).append(" -> ");
            current = current.getNext();
        }

        linkedListString.append("null");

        return "linkedList: " + linkedListString + ";\n" +
                "elements: " + elements + ".";
    }
}
