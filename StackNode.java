public class StackNode {
    private StackNode Next;
    private int data;

    public StackNode(int data) {
        this.data = data;
    }

    public StackNode getNext() {
        return Next;
    }

    public void setNext(StackNode next) {
        Next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
