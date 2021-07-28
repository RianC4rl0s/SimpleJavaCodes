package sortAlgorithms;

import structures.RcLinkedListInter;

public class LinearSearchDinamic {

	public<T> int buscaLinear(T data,RcLinkedListInter<T> dataList) {//data e lista
		if(dataList == null) {//verifica se não é nulo
			return -1;
		}else {
			int i = 1;
			T temp = dataList.search(i);
			while(temp != null ) {//percorre a lista enquanto nao achar o valor
				if(temp == data) {
					
					return i;// se achar retorna o id
				}
				i++;
				temp = dataList.search(i);
				
			}
		}
		return -1;// se nao achar retorna o -1
	}
}
