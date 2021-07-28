package structures;


public class Questao8 {

	public static void main(String[] args) {
	String teste = " 8 1 + 2 -";
	RcStackInter<Integer> testePilha = new RcStackLinkedList<Integer>();
	String[] valores = teste.split(" ");
	
	
	for(int i = 0; i < valores.length; i++) {
		//System.out.println(valores[i]);
		if(valores[i].matches("[0-9]{1}")) {
			testePilha.push(Integer.parseInt(valores[i]));
		}
		if(valores[i].equals("+")) {
			testePilha.push(testePilha.pop() + testePilha.pop());
		}
		if(valores[i].equals("-")) {
			testePilha.push(-testePilha.pop() + testePilha.pop());
		}
	}
		System.out.println( "="+ testePilha.pop());
		
	}
	
}
