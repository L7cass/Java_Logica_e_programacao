package Principal;

import java.util.Scanner;

public class AnoBissexto {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int ano;

		System.out.println("digite um ano: ");
		ano = leia.nextInt();

		int divisao = ano / 4;

		if (ano == divisao) {
			System.out.println(ano + " � um ano bissexto: ");
		} else {
			System.out.println(ano + " n�o � um ano bissexto");
		}

	}

}
