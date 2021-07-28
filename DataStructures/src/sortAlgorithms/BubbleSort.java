package sortAlgorithms;



public class BubbleSort < T extends Comparable<? super T>>{

	public void bubbleSort(T[] lista){
		int tam = lista.length;
		
		while(tam > 0) {
			int ultimoModificado =0;
			for(int i =1; i  < tam;i++) {
				if(lista[i-1].compareTo(lista[i])> 0) {
					T aux = lista[i-1];
					lista[i-1] = lista[i];
					lista[i] = aux;
					
					ultimoModificado = i;
				}
				
			}
			
			tam= ultimoModificado;
		}
	
	}
	
	
}
