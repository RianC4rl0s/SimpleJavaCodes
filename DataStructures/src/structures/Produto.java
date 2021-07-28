package structures;

public class Produto {
	
	private String nome ;
	private int quantidade;
	private float peso;
	private float preco;
	
	public Produto() {
		
	}
	public Produto(String nome, int quantidade) {
		this.nome = nome;
		this.quantidade = quantidade;
	}
	public Produto (String nome, int quantidade, float peso, float preco) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.peso = peso;
		this.preco = preco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	@Override
	public String toString() {
		return("Nome = " + nome + " Quantidade = " +quantidade +" Peso = "+peso+" Preço = "+preco);
	}
}
