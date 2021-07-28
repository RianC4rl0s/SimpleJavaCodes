package structures;

public interface RcQueueInter <T>{
	public boolean isFull();
	public boolean isEmpty();
	public void add(T v) throws Exception;
	public T remove() throws Exception;
	public T peek() throws Exception;
	public void show();
	public int getSize();
}
