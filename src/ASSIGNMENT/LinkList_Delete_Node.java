package ASSIGNMENT;

import java.util.Scanner;

public class LinkList_Delete_Node {

	private class Node {

		int data;
		Node next;

	}

	private Node head;
	private Node tail;
	private int size;

	public void addLast(int item) {

		Node nn = new Node();

		nn.data = item;
		nn.next = null;

		// update summary
		if (size == 0) {
			this.head = nn;
			this.tail = nn;
			size++;
		} else

		{
			this.tail.next = nn;
			this.tail = nn;

			size++;
		}

	}

	void reverseList() {
		Node current = head;
		Node prev = null;
		Node next;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
	}

	void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	// Deletes nodes which have greater value node(s) on left side

	void deleteNode() {
		Node current = head;

		/* Initialize max */
		Node maxnode = head;
		Node temp;

		while (current != null && current.next != null) {

			// If current is smaller than max, then delete current

			if (current.next.data < maxnode.data) {
				temp = current.next;
				current.next = temp.next;
				temp = null;
			}

			// If current is greater than max, then update max and move current

			else {
				current = current.next;
				maxnode = current;
			}
		}
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		LinkList_Delete_Node list1 = new LinkList_Delete_Node();
		int n = scn.nextInt();
		for (int i = 0; i < n; i++)
			list1.addLast(scn.nextInt());

		// 1.Reverse the linked list
		list1.reverseList();

		/*
		 * 2) In the reversed list, delete nodes which have a node with greater
		 * value node on left side. Note that head node is never deleted because
		 * it is the leftmost node.
		 */
		list1.deleteNode();

		// 3) Reverse the linked list again to retain the original order
		list1.reverseList();

		list1.printList();

	}
}