package DSA;
import java.util.*;
class Node{
	int data;
	Node next;
	Node(int data){
		this.data = data;
	}
	Node(int data, Node next){
		this.data = data;
		this.next = next;
	}
}
public class MiddleOfTheLinkedList {
	public static Node findMiddle(Node head){
		Node fast = head;
		Node slow = head;
		while(fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow;
	}
	
public static void main(String args[]) {
//	 Node head = new Node();
//     head.data = 1;
//     head.next = new Node();
//     head.next.data = 2;(without constructor)
	Node head = new Node(1);
	head.next = new Node(2);
	head.next.next = new Node(3);
	head.next.next.next = new Node(4);
	head.next.next.next.next = new Node(5);
	Node middleNode = findMiddle(head);
	if(middleNode != null) {
	System.out.println("The middle node is:" + middleNode.data);
	}
	else {
		System.out.println("The middle node is null");
	}
	
	
}
}
