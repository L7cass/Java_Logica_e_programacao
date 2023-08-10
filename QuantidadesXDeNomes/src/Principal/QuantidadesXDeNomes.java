package Principal;

import java.util.Scanner;

public class QuantidadesXDeNomes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);

		System.out.println("digite a quantidade de nomes: ");
		int quantidadedenomes = Sc.nextInt();

		String[] nomes = new String[quantidadedenomes];
		for (int i = 0; i < quantidadedenomes; i++) {
			System.out.println("digite o nome # " + (i + 1) + ": ");
			nomes[i] = Sc.next();
		}
		System.out.println("Nomes insiridos:");
		for (String nome : nomes) {
			System.out.println(nome);
		}
	}

}
