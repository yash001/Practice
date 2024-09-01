/**
 * 
 */
package org.example.LinkedList;

/**
 * 
 */
public class LinkedListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("hey");
		/*
		 LinkedList<Integer> list = new LinkedList<Integer>();
		 list.add(10);
		 list.add(11);
		 list.add(12);
		 list.add(13);
		 list.add(14);
		 
		 for (Integer element : list) {
	            System.out.println(element);
	     }
	     */
		LinkList list = new LinkList();
		list.insert(11);
		list.insert(12);
		list.insert(13);
		list.insert(14);
		list.insert(18);
		System.out.println("Initial list elements ");
		list.printLinkedList();
		

		
		System.out.println("Before updating element ");
		list.printLinkedList();
		System.out.println("After update element ");
		list.update(18,15);
		list.printLinkedList();
		
		System.out.println("Before delete elements ");
		list.printLinkedList();
		int element = 15;
		System.out.println("After deleting element "+element);
		list.delete(element);
		list.printLinkedList();
		
		
	}

	
}
