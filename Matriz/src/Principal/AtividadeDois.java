package Principal;

import java.util.Scanner;

public class AtividadeDois {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);

		String[][] alunos = new String[4][5];
		for (int i = 0; i < alunos.length; i++) {
			System.out.print("Digite o nome do aluno " + i + 1 + ":");
			alunos[i][0] = Sc.nextLine();

			for (int j = 1; j < alunos[i].length; j++) {
				System.out.print("Digite a nota " + j + " para " + alunos[i][0] + ": ");
				alunos[i][j] = Sc.nextLine();
			}

		}

		System.out.println("\nNomes e Notas dos alunos: ");
		for (int i = 0; i < alunos.length; i++) {
			System.out.println(alunos[i][0] + ": ");
			for (int j = 1; j < alunos[i].length; j++) {
				System.out.print(alunos[i][j] + "\t");

			}
		}
		System.out.println();

	}

}
