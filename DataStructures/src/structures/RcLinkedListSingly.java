package structures;


public class RcLinkedListSingly <T> implements RcLinkedListInter <T>{
	
	
	//Classe interna onde é salvo os endereços dos objetos
	class Node{
		
		int id;
		T data;
		Node next; // Proximo objeto
		
		public Node(T data) {
			this.id = nextId;
			nextId++;
			
			this.data = data;
			this.next = null;
		}
	}
	
	
	private int nextId;//Proximo id da lista
	private Node head;//primeiro objeto da lista
	private Node tail;//ultimo
	private int size;//tamanho
	
	public int getSize() {
		return size;
	}
	
	public RcLinkedListSingly() {
		head = null;
		tail = null;
		nextId = 1;
		size = 0;
	}
	
	public void add(T data) {
		addLast(data);//Chamada rapida para adicionar ao final
	}
	public void addLast(T data) {
		Node nData  = new Node(data); // cria um novo node e salva o objeto
		if(head == null) {//se vazio, head e tail tao os msm objetos
			head = nData;
			tail = nData;
		}else {//se nao tail 
			tail.next = nData; 
			tail = nData;
		}
		size++;
	}
	public void addFirst(T data) {
			Node nData = new Node(data); // cria novo node com o objeto
			
			if(head == null) {//se vazio incia
				head = nData;
				tail = nData;
			}else {// 
				nData.next = head;//o novo node.next = o cabeçalho
				head = nData;//e o abeçado recebe o novo node
			}
			size++;
	}
	public void addAfter(T data, int id) throws Exception {
		Node p = searchNode(id);
		
		if(p == null) {
			throw new Exception();
		}else {
			Node nData = new Node(data);
			
			if(p.next == null) {
				tail = nData;
			}
			nData.next = p.next;
			p.next = nData;
		}
		size++;
	}
	//Busca ponteiro com id requisitado
	public Node searchNode(int id) {
		Node p = head;
		while(p != null) {//enquando o ponteiro não apontar para nada
			if(p.id == id) {//verifica se o id confere, se sim retorna
				return  p;
			}
			p = p.next;// se nao incrementa
		}
		return null;//retorna nulo se nao tiver nada
	}
	//Funções de vizualização
	public T peekFirst() {//retorna o head se nao for vazio sem deletar
		if(head == null) {
			return null;
		}else {
			return head.data;
		}
	}
	public T peekLast() {//retorna a tail se ela existir sem deletar
		if(tail == null) {
			return null;
		}else {
			return tail.data;
		}
	}
	public T search(int id) { //busca o objeto pelo id
		Node p = searchNode(id);
		if(p== null) {
			return null;
		}else {
			return p.data;
		}
		
	}
	public T removeFirst() { //retorna o head da lista deletando apos
		Node p = head;
		T result = null;
		
		if(head == null) {
			
			return null;
		
		}else {
			
			result = p.data;
			
			if(head ==  tail) {
				head = null;
				tail = null;
				//a lista fica vazia
			}else {
				head = head.next;
			}
			p.next = null;
			
			size--;
		}
		return result;
	}
	
	public T removeLast() {// retorna o tail da lista depois deleta
		T result = null;
		
		if(tail == null) {
			return null;
		}else{
			
			result = tail.data;
			
			if(head == tail) {
				head = null;
				tail = null;
				// a lista fica vazia;
			}else {
				Node p = head;          
				while (p.next != tail) {
					p = p.next;
				}
				tail = p;//define o final da lista
				tail.next = null;// e diz que nao tem nada depois dali
			}
			size--;
		}
		return result;
	}
	public Node searchBefore(int id) {
		Node p = head;
		Node previus = null;
		while(p != null) {
			 previus = p;
			 p=p.next;
			 
			 if(p != null && p.id == id) {
				 return previus;
			 }
		}
		return null;
	}
	public T remove(int id) { //remove um item pelo id
		Node previus = null; //node auxiliar
		Node removed = null; // node auxiliar
		T result = null;// resultado
		
		if(head == null) {//verifica se nao esta vazio
			return null;
		}
		previus = searchBefore(id);
		if(previus == null){
			removed = head;
			if(head == tail) {
				
				head = null;
				tail = null;
				//zera a lista
			}else {
				head = head.next;
				removed.next = null;
			}
		}else {
			removed = previus.next;
			if(removed == tail) {
				tail = previus;
				previus.next = null;
			}else {
				previus.next = removed.next;
				removed.next = null;
			}
			
		}
		result = removed.data;
		
		return result;
	}
	public void show()
	{
	    Node p = head;
		if(p == null) {
			System.out.println("Empty\n");
		}
		else{
	        while( p != null ){
	            System.out.println("ID = " + p.id +" Data = " + p.data +"\n");
	            p = p.next;
	        }
	    }
		
		System.out.println("Size = " + size + "\n");
	}
	
}

















