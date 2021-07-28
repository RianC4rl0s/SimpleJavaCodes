package structures;

public class RcQueueLinkedList <T> implements RcQueueInter<T>{
	
	//private int first;
	//private int last;
	private RcLinkedListInter<T> data;
	
	public RcQueueLinkedList(){

		this.data = new RcLinkedListDouble<T>();
	}
	public boolean isFull() {
		return false;
	}
	public boolean isEmpty() {
		if(data.getSize() >= 0) {
			return false;
		}else {
			return true;
		}
	}
	public void add(T data) throws Exception{
		this.data.addLast(data);
	}
	public T remove() throws Exception {
		T result;
		result = this.data.removeFirst();
		return result;
	}
	
	public T peek() throws Exception {
		T result;
		
		
		result = this.data.peekFirst();
			
		return result;
	}
	public void show() {
		this.data.show();
	}
	
	public int getSize() {
		return this.data.getSize();
	}
	
}
