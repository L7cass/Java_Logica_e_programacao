package Principal;

import java.util.Scanner;

public class GastosMensaisDaEmpresa3Meses {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int mes1;
		int mes2;
		int mes3;

		System.out.println("quanto foi gastado no 1� mes? ");
		mes1 = leia.nextInt();
		System.out.println("quanto foi gastado no 2� mes? ");
		mes2 = leia.nextInt();
		System.out.println("quanto foi gastado no 3� mes? ");
		mes3 = leia.nextInt();

		int soma = mes1 + mes2 + mes3;

		System.out.println("valor gasto? " + soma + "R$");

		int soma2 = soma / 3;

		System.out.println("a media dos gastos s�o: " + soma2 + "R$");

	}

}
