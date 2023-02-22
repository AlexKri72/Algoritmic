package HomeworkLesson3;

public class TwoLinkedList {
    private TwoLinkedNode head;
    private TwoLinkedNode tail;

    public TwoLinkedNode getHead() {
        return head;
    }

    public TwoLinkedNode getTail() {
        return tail;
    }

    public void setHead(TwoLinkedNode node) {
        this.head = node;
    }

    public void setTail(TwoLinkedNode node) {
        this.tail = node;
    }

    public void addFirst(TwoLinkedNode node) {
        if (head != null) {
            node.setNext(head);
            node.setPrevious(null);
            head.setPrevious(node);
        } else {
            tail = node;
        }
        head = node;

    }

    public void addLast(TwoLinkedNode node) {
        if (tail != null) {
            node.setPrevious(tail);
            tail.setNext(node);
        } else {
            head = node;
        }
        tail = node;
    }

    public TwoLinkedNode getNode(Integer value) {
        TwoLinkedNode node = head;
        while (node != null) {
            if (node.getValue() == value) {
                return node;
            }
            node = node.getNext();
        }
        return null;
    }

    public void deleteFirst() {
        if (head != null) {
            head = head.getNext();
            head.setPrevious(null);
        }
    }

    public void deleteLast() {
        if (tail != null) {
            tail = tail.getPrevious();
            tail.setNext(null);
        }
    }

}
