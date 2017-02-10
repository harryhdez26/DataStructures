package dataStructures.testing;

import static org.junit.Assert.*;
import org.junit.Test;
import dataStructures.lists.SinglyLinkedList;

public class SinglyLinkedListTester {
	
	@Test
	public void addFirstTest() {
		
		SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
		
		list.addFirst(5);
		int first = list.first();
		assertEquals(5, first);
		
		list.addFirst(7);
		first = list.first();
		assertEquals(7, first);
		
		list.addFirst(0);
		first = list.first();
		assertEquals(0, first);
		
		list.addFirst(-3);
		first = list.first();
		assertEquals(-3, first);
	}
	
	@Test
	public void addLastTest() {
		
		SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
		
		list.addLast(9);
		int last = list.last();
		assertEquals(9, last);
		
		list.addLast(-1);
		last = list.last();
		assertEquals(-1, last);
		
		list.addLast(0);
		last = list.last();
		assertEquals(0, last);
	}
	
	@Test
	public void removeFirstTest() {
		SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
		list.addFirst(8);
		list.addFirst(5);
		list.addLast(-4);
		int removedInt = list.removeFirst();
		assertEquals(5, removedInt);
	}
}
