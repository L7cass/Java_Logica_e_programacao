package Principal;

import java.util.Scanner;

public class QuatroNotasBimestraisMedia7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);

		System.out.println("Digite o nome do aluno: ");
		String nome = Sc.nextLine();

		double[] notas = new double[4];
		double somaNotas = 0;

		for (int i = 0; i < 4; i++) {
			System.out.println("digite a nota do bimestre " + (i + 1) + ": ");
			notas[i] = Sc.nextDouble();
			somaNotas += notas[i];
		}

		Double media = somaNotas / 4;
		System.out.println("Media do Aluno " + nome + " " + media);

		if (media >= 7) {
			System.out.println("Aluno Aprovado!!");
		} else {
			System.out.println("Aluno Reprovado.");
		}

	}

}
