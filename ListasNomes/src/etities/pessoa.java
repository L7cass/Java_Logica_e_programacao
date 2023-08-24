package etities;

public class pessoa implements Comparable<pessoa> {

	private String nome;
	private pessoa pessoa;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome: " + nome;
	}

	public int compareTo(pessoa umaOutraPessoa) {
		// TODO Auto-generated method stub
		return ((pessoa) this.pessoa).compareTo(umaOutraPessoa);
	}

}
