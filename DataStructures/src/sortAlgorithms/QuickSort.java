package sortAlgorithms;

public class QuickSort < T extends Comparable<? super T>>{

	public void quickSort(T[] lista, int inicio, int fim) {
		int i = inicio;
		int j = fim;
		T pivo =lista[(inicio + fim)/2];
		
		while(i < j) {
			
			while(lista[i].compareTo(pivo) < 0) {
				i = i+1;
			}
			
			while(lista[j].compareTo(pivo) > 0){
				j = j-1;
			}
			
			if(i <=j) {
				T temp = lista[i];
				lista[i] = lista[j];
				lista[j] = temp;
				i = i+1;
				j = j-1;
			}
		
		}
		
		
		if(j > inicio) {
			quickSort(lista, inicio, j);
		}
		if(i < fim) {
			quickSort(lista, i, fim);
		}
		
	}
	
}
