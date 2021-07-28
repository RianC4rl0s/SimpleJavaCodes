package structures;
import java.util.Scanner;




public class Questao1{
	public static void main(String[] args) {
		RcStackInter<Produto> produtos = new RcStack<Produto>(5);	
		System.out.println(produtos.getSize());
		produtos.show();
		
		System.out.println("Menu");
		System.out.println("1 - push");
		System.out.println("2 - peek");
		System.out.println("3 - pop");
		System.out.println("4 - isFull");
		System.out.println("5 - isEmpty");
		System.out.println("6 - show");
		System.out.println("0 - exit");
		System.out.println("selecione : ");
		Scanner teclado = new Scanner(System.in);
		int opc = teclado.nextInt();
		teclado.nextLine();
		while(opc != 0) {
			if(opc == 1) {
				try {
					System.out.println("Digite o nome:");
					String nome = teclado.nextLine();
					System.out.println("Digite a quantidade: ");
					int quantidade = teclado.nextInt();
					System.out.println("Digite o peso: ");
					float peso = teclado.nextFloat();
					System.out.println("Digite o preço :");
					float preco = teclado.nextFloat();
					produtos.push(new Produto(nome,quantidade,peso,preco));
					System.out.println(produtos.getSize());
					produtos.show();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}else if(opc == 2) {

				try {
					 Produto p = produtos.peek();
					 System.out.println(p.toString());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(produtos.getSize());
				produtos.show();
				
				
			}else if(opc == 3) {
				try {
					 Produto p = produtos.pop();
					 System.out.println(p.toString());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(produtos.getSize());
				produtos.show();
				
			}else if(opc == 4) {
				System.out.println(produtos.isFull());
				
			}else if(opc == 5) {
				System.out.println(produtos.isFull());
				
			}else if(opc == 6) {
				produtos.show();

			}
			System.out.println("Menu");
			System.out.println("1 - push");
			System.out.println("2 - peek");
			System.out.println("3 - pop");
			System.out.println("4 - isFull");
			System.out.println("5 - isEmpty");
			System.out.println("6 - show");
			System.out.println("0 - exit");
			System.out.println("Selecione : ");
			opc = teclado.nextInt();
			teclado.nextLine();
		}
		teclado.close();
		
		
	}
	
}
