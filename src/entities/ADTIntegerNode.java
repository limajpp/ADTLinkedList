package entities;

public class ADTIntegerNode {
    private final int ELEMENT;
    private ADTIntegerNode next;

    public ADTIntegerNode(int element) {
        this.ELEMENT = element;
        next = null;
    }

    public ADTIntegerNode getNext() {
        return next;
    }

    public void setNext(ADTIntegerNode next) {
        this.next = next;
    }

    public int getElement() {
        return ELEMENT;
    }
}
