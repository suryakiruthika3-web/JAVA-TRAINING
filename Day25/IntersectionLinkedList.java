public class IntersectionLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node getIntersection(Node a, Node b) {

        Node p1 = a;
        Node p2 = b;

        while (p1 != p2) {

            if (p1 == null)
                p1 = b;
            else
                p1 = p1.next;

            if (p2 == null)
                p2 = a;
            else
                p2 = p2.next;
        }

        return p1;
    }

    public static void main(String[] args) {

        Node common = new Node(8);
        common.next = new Node(10);

        Node head1 = new Node(3);
        head1.next = new Node(7);
        head1.next.next = common;

        Node head2 = new Node(99);
        head2.next = new Node(1);
        head2.next.next = common;

        Node result = getIntersection(head1, head2);

        if (result != null)
            System.out.println("Intersection at : " + result.data);
        else
            System.out.println("No Intersection");
    }
}