package HomeworkLesson3;

public class Revers {
    public static void TwoLinkedListReverse(TwoLinkedList list) {
        TwoLinkedNode node = list.getHead();
        TwoLinkedNode next = node.getNext();
        TwoLinkedNode previous = null;
        while (next != null) {
            if (previous == null) {
                node.setNext(null);

            } else {
                node.setNext(previous);
            }
            node.setPrevious(next);
            previous = node;
            node = next;
            next = next.getNext();
        }
        node.setPrevious(null);
        node.setNext(previous);
        list.setTail(list.getHead());
        list.setHead(node);
    }
}
