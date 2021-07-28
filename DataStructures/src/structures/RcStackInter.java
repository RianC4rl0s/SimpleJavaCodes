package structures;

import exception.MyException;

public interface RcStackInter <T>{
	public void push(T data) throws MyException;
	public T pop() throws MyException;
	public T peek() throws MyException;
	public boolean isFull();
	public boolean isEmpty();
	public void show() ;
	public int getSize();
}
