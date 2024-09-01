/**
 * 
 */
package org.example.LinkedList;

/**
 * 
 */
public class LinkList {

	
	Node head;
	//create
	public void insert(int data) {
		// TODO Auto-generated method stub
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			
		} else {
			Node curr = head;
			while(curr.next != null) {
				curr = curr.next;
			}
			curr.next = newNode;
			
		}
		
	}
	
	//read
	public void printLinkedList() {
		Node curr = head;
		while(curr != null) {
			System.out.print(" "+curr.data+" --> ");
			curr = curr.next;
		}
		 System.out.println("null");
	}
	
	// 11 , 12, 13
	// 11 , 13
	//delete
	public void delete(int data) {
		if(head == null) {
			System.out.println(" List is empty ");
			return ;
		}
		if(head.data == data) {
			head = head.next;
		}
		Node curr = head;
		//Node prev = new Node();
		
		while(curr.next != null) {
			
			if(curr.next.data == data) {
				curr.next = curr.next.next;	
				return;
			} 
				curr = curr.next;
			
			
		}
		
		
		
		
	}

	//11 , 12, 18  ,update -> 18,13
	//11 , 12 ,13
	//create
	public void update(int oldData, int newData) {
		
		// TODO Auto-generated method stub
		if(head == null) {
			System.out.println(" List is empty ");
			return ;
		}
		if(head.data == oldData) {
			head.data = newData;
		}
		Node curr = head;
		while(curr.next != null) {
			if(curr.next.data == oldData) {
				curr.next.data = newData;
				return;
			}
			curr = curr.next;
		}
	}
	
}
