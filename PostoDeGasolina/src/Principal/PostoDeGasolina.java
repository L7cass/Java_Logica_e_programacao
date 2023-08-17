package Principal;

import java.util.Scanner;

public class PostoDeGasolina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);

		// leitura da quantidade de litros
		System.out.println("Digite a quantidade de litros: ");
		int Litros = Sc.nextInt();

		// Leitura do tipo de combustivel
		System.out.println("Digite o tipo de combudtível (A/G): ");
		char TipoDeCombustivel = Sc.next().charAt(0);

		// estabelecimento de preços de cada combustível

		double valorG = 5.80;
		double valorA = 3.90;
       // dividindo pra qual desconto o cliente vai ter 
		double ValorTotal;
		if (TipoDeCombustivel == 'G')
			;
		{
			if (Litros <= 20) {
				ValorTotal = Litros * (valorG - (valorG * 0.04));
			} else {
				ValorTotal = Litros * (valorG - (valorG * 0.06));
			}
		}
		if (TipoDeCombustivel == 'A')
			;
		{
			if (Litros <= 20) {
				ValorTotal = Litros * (valorA - (valorA * 0.03));
			} else {
				ValorTotal = Litros * (valorG - (valorG * 0.05));
			}
		}
		System.out.println("valor a ser pago: R$ " + ValorTotal);

	}

}
