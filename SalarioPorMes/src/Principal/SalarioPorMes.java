package Principal;

import java.util.Scanner;

public class SalarioPorMes {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		// Fa�a um Programa que pergunte quanto voc� ganha por hora
		// e o n�mero de horas trabalhadas no m�s.
		// Calcule e mostre o total do seu sal�rio no referido m�s (sem descontos e
		// impostos).

		int salario;
		int horas;

		System.out.println("qual o seu salario(por hora)? ");
		int R$;
		salario = leia.nextInt();

		System.out.println("qual foi sua carga horaria(mensal)? ");
		horas = leia.nextInt();

		int soma = salario * horas;

		System.out.println("seu salario mensal foi: " + soma + "R$");

		leia.close();
	}

}
