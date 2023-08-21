package etities;

public class Pessoa {

	private String nome;
	private int idade;
	public int ano;
	public Object calcularIdade;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;

	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public void calcularIdade(int idade) {
		this.idade = 2023 - ano;
	}

	public int getIdade() {
		return idade;
	}

	public void imprimedados() {
		System.out.printf("%s tem %d anos", nome, idade);

	}

}
