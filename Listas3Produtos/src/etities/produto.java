package etities;

public class produto {

	private String nome;
	private int quantidade;
	private double preco;
	
	

	public produto(String nome, int quantidade, double preco) {
		super();
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
	}
	

	public produto(String nome, int quantidade) {
		super();
		this.nome = nome;
		this.quantidade = quantidade;
	}


	public produto() {
		// TODO Auto-generated constructor stub
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

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "nome: " + nome + ", Quantidade: " + quantidade + ", preço unitário: " + preco;
	}

	public int compareTo(produto outroProduto) {
		return this.nome.compareTo(outroProduto.nome);
	}

}
