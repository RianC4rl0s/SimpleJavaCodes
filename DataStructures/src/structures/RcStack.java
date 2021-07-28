package structures;

import exception.MyException;

public class RcStack <T> implements RcStackInter <T>{
	private int size; //Tamanho da pilha
	private Object[] array; // usando vetor de objetos guardar os dados
	private int top; // apontando o topo da pilha
	
	
	
	public RcStack(int size) {
		this.top = -1;
		this.size = size;
		this.array = new Object[size];
	}	
	public void push(T value) throws MyException{
		if(top == size - 1) {
			throw new MyException("ERROR");
		}else {
			top = top + 1;
			array[top] = value;
		}
	}
	
	@SuppressWarnings("unchecked")
	public T pop() throws MyException{
		T result;
		if(top == -1) {
			throw new MyException("ERROR");
		}else {
			result = (T) array[top]; //typeCast para T
			top = top-1;
		}
			return result;
	}
	@SuppressWarnings("unchecked")
	public T peek() throws MyException{
		T result;
		if(top == -1) {
			throw new MyException("ERROR");
		}else {
			result = (T) array[top]; //typeCast para T
		}
			return result;
	}
	public boolean isFull() {
		if(top == size-1) 
			return true;
		else 
			return false;
	}
	public boolean isEmpty() {
		if(top == -1) 
			return true;
		else 
			return false;
	}
	public void show() {
		for(int i  = 0; i<= top;i++) {
			System.out.println("["+i+"]" + array[i]);
		}
		System.out.println("Stack top = "+ top);
	}
	public int getSize() {
		return size;
	}
}
