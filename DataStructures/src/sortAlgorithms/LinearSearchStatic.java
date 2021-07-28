package sortAlgorithms;

public class LinearSearchStatic {
	
	public<T> int buscaLinear(T data, T[] dataList) {//data e lista
		if(dataList.length == 0 || dataList == null) {//verifica se nao é null ou vazio
			return -1;
		}else {
			for(int i = 0;i < dataList.length;i++){//precorre tudo ate achar o valor
				if(dataList[i] == data) {
					
					return i;
				}
			}
		}
		return -1;// se nao achar retorna -1
	}
}
