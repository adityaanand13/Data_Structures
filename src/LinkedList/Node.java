package LinkedList;

public class Node {
    private int Value;
    private Node Next;

    public Node(){
        Value = 0;
        Next = null;
    }

    public Node(int value) {
        Value = value;
        Next = null;
    }

    public Node(int value, Node next) {
        Value = value;
        Next = next;
    }

    public int getValue() { return Value; }

    public Node getNext() { return Next; }

    public boolean hasNext(){ return (Next!=null); }

    public void setValue(int value) { Value = value; }

    public void setNext(Node next) { Next = next; }
}
