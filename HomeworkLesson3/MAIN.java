package HomeworkLesson3;

public class MAIN {
    public static void main(String[] args) {
        TwoLinkedList list = new TwoLinkedList();
        list.addLast(new TwoLinkedNode(1));
        list.addLast(new TwoLinkedNode(2));
        list.addLast(new TwoLinkedNode(3));
        list.addLast(new TwoLinkedNode(4));
        list.addLast(new TwoLinkedNode(5));
        list.addFirst(new TwoLinkedNode(6));
        print(list);
        Revers.TwoLinkedListReverse(list);
        print(list);
    }

    public static void print(TwoLinkedList list) {
        System.out.println("\n  ");
        TwoLinkedNode node = list.getHead();
        System.out.println(String.format("%100s", "").replace(' ', '-'));
        while (node != null) {
            System.out.println(node);
            node = node.getNext();
        }
        System.out.println(String.format("%100s", "").replace(' ', '-'));
    }
}
