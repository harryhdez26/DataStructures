package dataStructures.lists.interfaces;

public interface SLL<E> {
	int size();
	boolean isEmpty();
	E first();
	E last();
	void addFirst(E e);
	void addLast(E e);
	E removeFirst();
}
