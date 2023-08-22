package Principal;

import java.util.Scanner;

import estities.carro;

public class CarroEncapsulamento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		carro carro = new carro();

		System.out.println("Digite o modelo do carro: ");
		carro.setModelo(sc.nextLine());

		System.out.println("Digite o ano do carro: ");
		carro.setAno(sc.nextInt());

		System.out.println("Digite a cor do carro: ");
		carro.setCor(sc.next());

		System.out.println("Digite o motor do carro: ");
		carro.setMotor(sc.next());

		System.out.println("Digite o cambio do carro: ");
		carro.setCambio(sc.next());
		
		carro.getVelocidadeMinima();

		System.out.println("Digite a velocidade maxima do carro: ");
		carro.setVelocidadeMaxima(sc.nextInt());
		
		carro.acelerarcarro(20);
		carro.acelerarcarro(20);
		carro.acelerarcarro(20);
		
		carro.freio(20);
		carro.freio(20);
		carro.freio(20);

		sc.close();

	}

}
