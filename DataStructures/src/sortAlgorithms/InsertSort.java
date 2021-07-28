package sortAlgorithms;

public class InsertSort  < T extends Comparable<? super T>>{

	public void insertSort(T[] lista) {
		int tam= lista.length;
		for(int i = 1; i<tam;i++) {
	
			int j = i; // j inicia com i atual par nao percorre oq ja esta ordenado
			while((j >0) && ( lista[j-1].compareTo(lista[j])>0 ) ){// se j > 0 e j-1 > jos dois sao permutados
			
				T aux = lista[j];
				lista[j] = lista[j-1];
				lista[j-1] = aux;
				
				j--;//ele volta apos permutar se decrementa J para realizar novamente o trabalho
			}
			
			
		}
	}
}
