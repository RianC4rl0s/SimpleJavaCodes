package sortAlgorithms;

public class ShellSort < T extends Comparable<? super T>>{
	
	public void shellSort(T[] lista) {
	
		int tam = lista.length;
		int h = 0;
		while (h  < tam) {
			h = 3 *h+1;
		}
		
		while(h > 1) {
			h = h/3;
		
			for(int i = h;i < tam -1;i++) {
				T temp = lista[i];
				
				 int j = i -h;
				 
				 while(j >= 0 && (temp.compareTo(lista[j])<0 )){
					 lista[j+h] = lista[j];
					 j = j-h;
				 }
				 
				 lista[j+h] = temp;
				 
			}
	
		}
			
	}
}
