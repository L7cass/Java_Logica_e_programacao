package etities;

public class produto {
	
	private String nome;
	private int quantidade;
	private double preco;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(int preco){
		this.preco += preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void adicionarQuantidade(int quantidade) {
		this.quantidade += quantidade;
	}
	public void removerQuantidade(int quantidade) {
		this.quantidade -= quantidade;
	}
	public void mostrarEstoque() {
		System.out.println("Nome do produto: " + nome);
		System.out.println("Quantidade em estoque: " + quantidade);
		System.out.println("Pre�o unitario: " + preco);
		System.out.println("Valor total em estoque: " + (quantidade * preco));
		
		
		
	}

}
