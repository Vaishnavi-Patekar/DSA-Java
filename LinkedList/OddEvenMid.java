public class OddEvenMid {

    static class Node {
        int data;
        Node next;

        Node(int val) {
            data = val;
            next = null;
        }
    }

    public static void printMiddle(Node head) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // If fast is null → EVEN length
        if (fast == null) {
            System.out.println("First middle: " + getPrev(head, slow).data);
           // System.out.println("Second middle: " + slow.data);
        }
        // If fast is not null → ODD length
        else {
            System.out.println("Middle: " + slow.data);
        }
    }

    // Helper method to get previous node
    private static Node getPrev(Node head, Node node) {
        Node temp = head;
        while (temp.next != node) {
            temp = temp.next;
        }
        return temp;
    }

    public static void main(String[] args) {

        // Change list to test
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        // head.next.next.next.next = new Node(50); // uncomment for odd

        printMiddle(head);
    }
}
