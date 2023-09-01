package etities;

import java.security.PublicKey;

public class pessoa {
	
	private String nome;
	private int idade;
	private String cpf;
	private char genero;
	private double altura;
	
	public pessoa() {
		super();
		
	}
	public pessoa(String nome, int idade, String cpf, char genero, double altura) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.genero = genero;
		this.altura = altura;
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
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public char getGenero() {
		return genero;
	}
	
	public void setGenero(char genero) {
		this.genero = genero;
	}

	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public String obterDadosPessoa() {
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + cpf);
		System.out.println("Idade: " + idade);
		System.out.println("Genero: " + genero);
		System.out.println("Altura: " + altura);
		
		@Override
		public String toString {
			return"Nome: " + nome
			+ "\nCPF: " + cpf
		    + "\nIdade: " + idade
			+ "\nGenero: " + genero
			+ "\nAltura: " + altura;
			
		}
	
		
		
	}
	public void setGenero(String string) {
		// TODO Auto-generated method stub
		
	}	
	
	

}
