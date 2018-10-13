package com.atulmaps.adt.lists;

public class SinglyLinkedList {

		private Node head;

		public SinglyLinkedList() {}

		public void insertAtHead (int data) {
			Node newNode = new Node(data);
			newNode.setNext(this.head);
			this.head = newNode;
		}

		public boolean isEmpty() {
			return this.head == null;
		}

		@Override
		public String toString() {
			String result = "[";
			Node currentNode = this.head;

			while(currentNode != null) {
				result += currentNode.toString();
				currentNode = currentNode.getNext();

				if (currentNode != null) result += "->";
			}
			result += "]";
			return result;
		}
}