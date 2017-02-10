package dataStructures.lists.interfaces;

public interface SinglyNode <E>{
	E getElement();
	SinglyNode<E> getNext();
	void setNext(SinglyNode<E> newNext);
	void setElement(E e);
}
