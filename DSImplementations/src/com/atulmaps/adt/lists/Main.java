package com.atulmaps.adt.lists;

public class Main {

	public static void main(String[] args) {

		SinglyLinkedList list = new SinglyLinkedList();

		// insert at Head
		list.insertAtHead(2);
		list.insertAtHead(7);
		list.insertAtHead(1);
		list.insertAtHead(20);
		list.insertAtHead(9);

		// insert at End
		list.insertAtEnd(99);
		list.insertAtEnd(101);

		System.out.println("List:"+list.toString());

		System.out.println("Size of the list: " + list.size());

		System.out.println("Is list empty: "+list.isEmpty());

	}

}
