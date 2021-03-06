package com.atulmaps.adt.lists;

public class SinglyLinkedList {

		private Node head;

		public SinglyLinkedList() {}

		public void insertAtHead (int data) {
			Node newNode = new Node(data);
			newNode.setNext(this.head);
			this.head = newNode;
		}

		public void insertAtEnd(int data) {
			Node newNode = new Node(data);
			if (this.isEmpty()) {
				this.head = newNode;
				return;
			}
			Node currentNode = this.head;
			Node prev = null;
			while(currentNode != null) {
				prev = currentNode;
				currentNode = currentNode.getNext();
			}
			prev.setNext(newNode);
		}

		public int size() {
			int length = 0;
			Node currentNode = this.head;
			while (currentNode != null) {
				length++;
				currentNode = currentNode.getNext();
			}
			return length;
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
