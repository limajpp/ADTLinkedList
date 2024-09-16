package entities;

public class ADTIntegerNode {
    private int element;
    private ADTIntegerNode next;

    public ADTIntegerNode(int element) {
        this.element = element;
        next = null;
    }

    public ADTIntegerNode getNext() {
        return next;
    }

    public void setNext(ADTIntegerNode next) {
        this.next = next;
    }

    public int getElement() {
        return element;
    }
}
