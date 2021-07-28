package structures;

import exception.MyException;

public class RcLinkedListDouble <T> implements RcLinkedListInter<T> {

	
	//classe interna onde os endereços sao salvos
	class Node{
		
		
		 int id;
		 T data;
		 Node next;//proximo
		 Node prev;//anterior
		 
		 public Node(T data) {
			 this.id = nextId;
			 nextId++;
			 
			 this.data = data;
			 this.next = null;
			 this.prev = null;
		 }
	}
	
	int nextId;//controlador de id 
	private Node head;//primeiro valor
	private Node tail;//ultimo
	private int size;
	
	public int getSize() {
		return size;
	}
	
	public RcLinkedListDouble() {//inicia vaizia e o primeiro id vai ser 1
		head = null;
		tail = null;
		size = 0;
		nextId = 1;
		
	}
	
	public void addFirst(T data) {// funcionar como singly
		Node nData= new Node(data);
		if(head == null) {
			head = nData;
			tail= nData;
		}else {
			nData.next = head;
			head.prev= nData;// aponta para o elemento anterior
			head = nData;
			
		}
		size++;
	}
	public void addLast(T data) {//funciona como singly
		Node nData = new Node(data);
		
		if(head == null) {
			head = nData;
			tail = nData;
		}else {
			
			nData.prev = tail;
			tail.next = nData;// aponta para o priximo elemento da calda
			tail = nData;
		}
	}
	public void add(T data) {//chamada rapida para adicionar por ultimo
		addLast(data);
	}
	public Node searchNode(int id) {//busca um node ingual aos singly
		Node p = head;
		 while (p != null) {
				 if(p.id == id) {
					 return p;
				 }
				 p = p.next;
		 }
		 return null;
	}
	public void addAfter(T data, int id) throws MyException {//adicona apos elemento
		Node p= searchNode(id);
		if(p == null) {
			throw new MyException("ERROR");
		}else {
			
			//novo elemento
			Node nData = new Node(data);
			
			if(p.next == null) {//se for ultimo muda o tail
				tail = nData;
			}
			
			nData.next = p.next;//ponteiro para o proxiimo
			nData.prev = p;//pronteiro para o anterior
			p.next = nData;// e o local recebe o valor
			
			Node temp = nData.next;
			if(temp != null) {
				temp.prev = nData; // verifica se é nullo quando add no tail
			}
		}
		size++;
	}
	
	public T peekFirst() {//recebe o primeiro sem remover
		if(head == null) {
			return null;
		}else {
			return head.data;
		}
		
	}
	public T peekLast() {//recebe o ultimo sem remover
		if(tail == null) {
			return null;
		}else {
			return tail.data;
		}
		
	}
	
	public T search(int id) {//recebe um especifico sem remover
		Node p = searchNode(id);
		
		if(p == null) {
			return null;
		}else {
			return p.data;
		}
	}
	
	public T removeFirst(){//remove o primeiro
		Node p = head;
		T result = null;
		if(head == null) {
			return null;
		}else {
			result = p.data;
			if(head == tail) {
				head = null;
				tail = null;
			}else {
				head = head.next;
				head.prev = null;
			}
				p.next = null;
				
				size--;
		}
		return result;
	}
	
	public T removeLast(){//remove o ultimo
		
		T result = null;
		if(tail == null) {
			
			return null;
			
		}else {
			result = tail.data;
			if(head == tail) {
				head = null;
				tail = null;
			}else {
				Node previous = tail.prev;
				tail.prev = null;
				tail = previous;
				tail.next = null;
			}
			
				size--;
		}
		return result;
	}
	
	public T remove(int id) {
		T  result = null;
		
		if(head == null) {
			return null;
		}
		
		Node anterior = null;
		Node removido = searchNode(id);
		
		if(removido != null) {
			anterior= removido.prev;
		}
		
		if(anterior == null) {
			
			if(head.id != id) {
				return null;
			}else {
				removido = head;
				if(head ==  tail) {
					head = null;
					tail = null;
				}else {
					head = head.next;
					head.prev = null;
					removido.next = null;
				}
			}
		}else {
			removido = anterior.next;
			
			if(removido == tail) {
				
				tail.prev = null;
				tail = anterior;
				tail.next = null;
				
			}else {
				Node frente = removido.next;
				
				
				anterior.next = frente;
				frente.prev = anterior;
				
				
				removido.next = null;
				removido.prev = null;
			}
		}
		result = removido.data;
		size--;
		
		
		return result;
		
	
	}
	
	
	
	
	public void show() {
		Node p = head;
		
		if(p == null) {
			System.out.println("Lista vazia");
		}else {
			while(p != null) {
				System.out.println("ID = " + p.id + " Dado = "+ p.data);
				
				p =p.next;
			}
		}
	}
	public void showReverse() {
		Node p = tail;
		
		if(p == null) {
			System.out.println("Lista vazia");
		}else {
			while(p != null) {
				System.out.println("ID = " + p.id + " Dado = "+ p.data);
				
				p =p.prev;
			}
		}
	}
	
	
	
	
	
	
}
