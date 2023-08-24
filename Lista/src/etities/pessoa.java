package etities;

public class pessoa implements Comparable<pessoa> {

	private String nome;
	private int idade;

	public pessoa(String nome) {
		super();
		this.nome = nome;
	}

	public pessoa(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome: " + nome + "\nIdade: " + idade;
	}

	@Override
	public int compareTo(pessoa umaOutraPessoa) {
		// TODO Auto-generated method stub
		return this.pessoa.compareTo(umaOutraPessoa);
	}

}
