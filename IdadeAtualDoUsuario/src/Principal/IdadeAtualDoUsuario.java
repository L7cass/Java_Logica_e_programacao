package Principal;

import java.util.Scanner;

import estities.usuario;

public class IdadeAtualDoUsuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		String nome;
		int dataDeNascimento;
		
		
		
		System.out.println("Digite o seu nome: ");
		nome = Sc.nextLine();
		
		System.out.println("Digite a data do seu nascimento: ");
	    dataDeNascimento = Sc.nextInt();
	    
	   
	   usuario.nome = nome;
		usuario.dataDenascimento = dataDeNascimento;
		
		System.out.println("A idade do " + nome + " é de " + (2023 - dataDeNascimento)+ " " + "anos de idade");
	    
	    Sc.close();

	}

}
