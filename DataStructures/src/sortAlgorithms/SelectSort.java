package sortAlgorithms;

public class SelectSort < T extends Comparable<? super T>> {
	public void selectSort(T[] lista) {
		int tam = lista.length;
		
		for(int i = 0; i < tam-1;i++) {
			int menor = i;
			for(int j = i+1; j < tam;j++) {
				if(lista[j].compareTo(lista[menor]) < 0 ) {
					menor = j;
				}
				
			}
			if(i != menor) {
				 T temp = lista[i];
				 lista[i] = lista[menor];
				 lista[menor] = temp;
				 
			}
		}
	}
}
