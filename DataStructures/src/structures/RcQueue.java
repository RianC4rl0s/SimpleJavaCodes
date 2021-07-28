package structures;

public class RcQueue <T> implements RcQueueInter<T>{
	
	private int size;
	private int first;
	private int last;
	private Object[] array;
	
	
	public RcQueue(int size){
		this.first =  - 1;
		this.last=  - 1;
		this.size = size;

		this.array = new Object[size];
	}
	public boolean isFull(){
	    int temp = (last + 1) % size; //Se o resto de last + 1 pelo tamanho for 0 está cheio
	    if (temp == first) {
	        return true;
	    }else{ 
	    	return false;
	    }
	}
	public boolean isEmpty() {
		int temp = (last +1) % size;
		if(temp == -1) {
			return true;
		}else {
			return false;
		}
	}
	public void add(T value) throws Exception{
		int temp = (last + 1) % size;
		if(this.isFull()) {
			throw new Exception();
		}else {
			
			last = temp;
			array[temp] = value;
			
			if(first == -1) { // Condição inicia o primeiro como 0 na primeira vez que um valor é adicinado
				first = 0;
			}
		
		}
	}
	@SuppressWarnings("unchecked")
	public T remove() throws Exception{
		T result;
		
		if(first == -1) {
			throw new Exception();
		}else {
			result = (T) array[first];
			
			if(first == last) {
				first = -1;
				last = -1;
			}else {
				first = (first + 1 )% size;;
			}
			
		}
		return result;
	}
	@SuppressWarnings("unchecked")
	public T peek() throws Exception{
		T result;
		if(first == -1) {
			throw new Exception();
			
		}else {
			result = (T) array[first];
			
		}
		return result;
	}
	
	public void show() {
		int i = first;
		
		if(first ==-1) {
			return;
		}
		while (i != last) {
			System.out.println("["+i+"]"+ array[i]);
			i++;
			if(i == size) {
				i = 0;
			}
			
		}
		System.out.println("["+i+"]"+ array[i]);
		System.out.println("First = "+ first+ " Last = "+ last);
	}
	public int getSize() {
		return size;
	}
	
}
