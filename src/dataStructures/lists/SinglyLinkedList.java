package dataStructures.lists;

import dataStructures.lists.interfaces.*;

public class SinglyLinkedList<E> implements SLL<E>{
	
	private int size = 0;
	private Node<E> head = null;
	private Node<E> tail = null;
	
	public SinglyLinkedList(){
		
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public E first() {
		if(isEmpty())
			return null;
		return head.getElement();
	}

	public E last() {
		if(isEmpty())
			return null;
		return tail.getElement();
	}

	public void addFirst(E e) {
		Node<E> newest = new Node<>(e, head);
		head = newest;
		if(isEmpty())
			tail = newest;
		size++;
		
	}

	public void addLast(E e) {
		Node<E> newest = new Node<>(e);
		if(isEmpty())
			head = newest;
		else
			tail.setNext(newest);
		tail = newest;
		size++;
	}

	public E removeFirst() {
		if(isEmpty())
			return null;
		
		E element = head.getElement();
		
		Node<E> temp = (Node<E>) head.getNext();
		head.setElement(null);
		head.setNext(null);
		head = temp;
		
		size--;
		
		if(isEmpty())
			tail = null;
		
		return element;
	}
	
	private class Node<T> implements SinglyNode<E>{

		private E element;
		private SinglyNode<E> next;
		
		public Node(E element, SinglyNode<E> next){
			this.element = element;
			this.next = next;
		}
		
		public Node(E element){
			this(element, null);
		}
		
		public E getElement() {
			return element;
		}

		public SinglyNode<E> getNext() {
			return next;
		}
		
		public void setNext(SinglyNode<E> newNext){
			next = newNext;
		}
		
		public void setElement(E e){
			element = e;
		}
		
	}
	
}
