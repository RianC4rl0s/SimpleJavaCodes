package sortAlgorithms;

public class BinarySearch <T extends Comparable< ? super T>> {

	public int binarySeach(T[] list, T data, int lo, int hi) {//lista, valor, high, low
		int ini =0;
		int fim = list.length-1;
		
		int result = -1;
		
		while(ini <= fim) { //enquanto  inicio menor ou igual ao fim
			int mid = (ini + fim)/2; // (meio = inicio + fim )/2
			if(data.compareTo(list[mid]) < 0) {//se o valor de data for menor que mid, mid -1 vira o novo fim 
				fim = mid -1;
			}else { // se nao
				if(data.compareTo(list[mid]) > 0) {//se maior mid +1 é o novo inicio
					ini = mid + 1;
				
				}else {
					result = mid;//se igual result = mid 
					ini = list.length;
				}
			}
		}
		
		return result;
	}
	
}
