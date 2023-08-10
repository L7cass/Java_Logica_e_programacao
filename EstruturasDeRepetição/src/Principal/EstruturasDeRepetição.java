package Principal;

import java.util.Scanner;

public class EstruturasDeRepeti��o {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);

		/*
		 * uma etrutura de repeti��o repete determinado bloco de codigo enquanto uma
		 * condi��o for satisfeita
		 */

		// fot = at�; utilizado quando sabemos
		// a quantidade de vezes que ser�necess�rio repetir o bloco

		for (int contador = 0; contador < 10; contador++) {
			System.out.println("contador est� valendo: " + contador);
		}

		/*
		 * while = enquanto geralmente usado quando n�o sabemos a quantidade de vezes
		 * que ser� executado determinado oomando
		 */
		int contador = 0;
		char opcao;

		System.out.println("deseja entrar no loop s/n");
		opcao = leia.next().charAt(0);

		while (opcao == 's') {
			System.out.println("contador valendo: " + contador);
			contador++;
			System.out.println("deseja continuar no loop s/n");
			opcao = leia.next().charAt(0);
		}

		/*
		 * do while executado pelo menos 1 vez, temos a garantia de que ser� executado
		 * ao menos uma vez
		 */

		do {
			System.out.println("contador valendo: " + contador);
			contador++;
			System.out.println("deseja continuar no loop s/n");
			opcao = leia.next().charAt(0);
		} while (opcao == 's');

		leia.close();

	}

}
