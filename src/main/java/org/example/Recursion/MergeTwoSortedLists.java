/**
 * 
 */
package org.example.Recursion;

import org.example.LinkedList.LinkList;
import org.example.LinkedList.Node;





/**
 8. Problem: Merge Two Sorted Lists
Problem Description:
Given two sorted linked lists, merge them into one sorted list. 

Solutions:
Time Complexity: O(m + n) — Linear time, where m and n are the number of nodes in the two linked lists.
Space Complexity: O(m + n) — Linear space, due to the depth of the recursion stack in the worst case.

Time Complexity:
The time complexity of the mergeTwoLists function is O(m + n), where m and n are the lengths of the two linked lists l1 and l2, respectively.
The function processes each node from both lists exactly once, combining them into a single sorted list.
Space Complexity:
The space complexity is O(m + n) in the worst case.
This is due to the recursive call stack, which can grow to the total number of nodes in the merged list. Each recursive call adds a frame to the stack, and the maximum depth of the recursion is m + n.
Summary:
Time Complexity: O(m + n) — Linear time, where m and n are the number of nodes in the two linked lists.
Space Complexity: O(m + n) — Linear space, due to the depth of the recursion stack in the worst case.
 */
public class MergeTwoSortedLists {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkList list = new LinkList();	
		Node head1 = new Node(11);
		head1.next = new Node(12);
		head1.next.next = new Node(13);
		head1.next.next.next = new Node(15);
	
	    
	
	    Node head2 = new Node(11);
	    head2.next = new Node(12);
	    head2.next.next = new Node(14);
	    head2.next.next.next = new Node(16);
		
		
	 // Print the original list
	    System.out.println("Original First list:");
	    list.printLinkedList();
	    
	    System.out.println("Original Second list:");
	    list.printLinkedList();
	
	    // Reverse the list by passing the head node
	     Node mergeHead = mergeTwoSortedLists(head1,head2);
	     
	    // Print the reversed list
	    System.out.println("Merged Two list:");
	    list.printLinkedList();
	}

	private static Node  mergeTwoSortedLists(Node list1, Node list2) {
		// TODO Auto-generated method stub
		if(list1 == null) return list2;
		if(list2 == null) return list1;
		
		if(list1.data < list2.data) {
			list1.next = mergeTwoSortedLists(list1.next,list2);
			return list1;
		}else {
			list2.next = mergeTwoSortedLists(list1,list2.next);
			return list2;
		}
		
		
	}

}
