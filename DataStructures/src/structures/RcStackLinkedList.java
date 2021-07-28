package structures;

import exception.MyException;

public class RcStackLinkedList <T> implements RcStackInter<T>{
	//int size;
	//int top;
	private RcLinkedListInter<T> data;
	
	
	
	public RcStackLinkedList() {
		//this.size = size;
		//this.top = -1;
		this.data = new RcLinkedListSingly<T>();
	}
	
	public void push(T value) throws MyException {
		
		/*if(top == size -1 ) {
			throw new Exception();
		}else {
			this.data.addFirst(value);
			top++;
		}
		*/
		this.data.addFirst(value);
	}
	public T peek() throws MyException{
		T result ;
		/*
		if( top == -1) {
			throw new Exception();
		}else {
			result = this.data.peekFirst();
		}*/
		result = this.data.peekFirst();

		return result;
	}
	public T pop() throws MyException{
		T result ;
		/*
		if( top == -1) {
			throw new Exception();
		}else {
			result = this.data.removeFirst();
		}
		*/
		
		result = this.data.removeFirst();
		return result;
	}
	public int getSize() {
		return this.data.getSize();
	}
	public boolean isFull() {
		return false;
	}
	public boolean isEmpty() {
		if(this.data.getSize() >0) {
			return false;
		}else {
			return true;
		}
	}
	public void show() {
		this.data.show();
	}
	
	
	
}
