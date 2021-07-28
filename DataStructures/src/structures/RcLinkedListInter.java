package structures;

public interface RcLinkedListInter <T>{

	public int getSize();
	
	public void add(T data);
	 public void addLast(T data);
	 public void addFirst(T data);
	 public void addAfter(T data, int id) throws Exception;
	 
	 
	 public T peekFirst() ;
	 public T peekLast() ;
	 
	 public T search(int id);
	
	 
	 public T removeFirst();
	 public T removeLast(); 
	 public T remove(int id);

	 
	 public void show();



}
