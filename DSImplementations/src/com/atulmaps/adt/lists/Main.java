package com.atulmaps.adt.lists;

public class Main {

	public static void main(String[] args) {

		SinglyLinkedList list = new SinglyLinkedList();

		list.insertAtHead(2);
		list.insertAtHead(7);
		list.insertAtHead(1);
		list.insertAtHead(20);
		list.insertAtHead(9);

		System.out.println(list.toString());

	}

}
