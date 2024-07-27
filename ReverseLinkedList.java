package DSA;

class Node {
    int val;
    Node next;

    Node() {}
    Node(int val) 
    { this.val = val; }
  }

public class ReverseLinkedList {
    
    public static Node reverseList(Node head) {
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        Node reversedList = reverseList(head);

        System.out.println("Reversed list is");
        Node curr = reversedList;
        while (curr!= null) {
            System.out.println(curr.val);
            curr = curr.next;
        }
    }
}
