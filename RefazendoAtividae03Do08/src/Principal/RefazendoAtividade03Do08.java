package Principal;

import java.util.Scanner;

public class RefazendoAtividade03Do08 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		String nome;
		int idade;
		double altura;
		char sexo;

		System.out.println("digite seu nome: ");
		nome = leia.nextLine();

		System.out.println("digite sua idade: ");
		idade = leia.nextInt();

		System.out.println("digite sua altura: ");
		altura = leia.nextDouble();

		System.out.println("digite seu sexo (m/f): ");
		sexo = leia.next().charAt(0);

		System.out.println("Nome Digitado foi: " + nome);
		System.out.println("idade digitada foi: " + idade);
		System.out.println("altura digitada foi: " + altura);
		System.out.println("seu sexo é : " + sexo);

		leia.close();

	}

}
