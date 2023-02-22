package HomeworkLesson3;

public class TwoLinkedNode {
    private TwoLinkedNode previous;
    private TwoLinkedNode next;
    private Integer value;

    public TwoLinkedNode() {
        this(null);
    }

    public TwoLinkedNode(Integer value) {
        this.value = value;
    }

    public TwoLinkedNode getNext() {
        return this.next;
    }

    public void setNext(TwoLinkedNode node) {
        this.next = (TwoLinkedNode) node;
    }

    public Integer getValue() {
        return this.value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public TwoLinkedNode getPrevious() {
        return this.previous;
    }

    public void setPrevious(TwoLinkedNode node) {
        this.previous = (TwoLinkedNode) node;
    }

    @Override
    public String toString() {
        return "TwoLinkedNode{" +
                " value=" + value +
                "\tpreviousNode=" + (previous != null ? previous.hashCode() : "null") +
                "\tself=" + hashCode() +
                "\tnextNode=" + (next != null ? next.hashCode() : "null") +
                " }";
    }
}
