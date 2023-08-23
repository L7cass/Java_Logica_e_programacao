package etities;

public class Cadastro {
	private String nome;
	private int idade;
	private double salarioBruto;
	private double bonus;
	
	
		
	public double getBonus() {
		return bonus;
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
	public double getSalarioBruto() {
		return salarioBruto;
	}
	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}
	public void mostrarCadastro() {
		System.out.println("Funcionario: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Salario: " + salarioBruto);
		System.out.println("bonus: " + getBonus());
		System.out.println("Salario atualizado: " + (salarioBruto + getBonus()));
		
	} 
	

}
