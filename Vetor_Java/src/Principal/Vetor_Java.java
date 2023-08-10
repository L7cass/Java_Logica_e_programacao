package Principal;

public class Vetor_Java {

	public static void main(String[] args) {
		// vetor e uma sequencia não odernada de dados do mesmo tipo
		// a contagem do vetor é por indice e inicia do indicie o
		// vetor não pode conter dados do tipos diferentes
		// vetor tbm e conhecido como Array
		// vetor é unidimensonal , uma direção
		// os dados do array são armazenados em um espaço de memoria

		/*
		 * (xpto123) = 10 , 20 , 30 , 40
		 */

		int array = 5;
		String nome = "lucas";

		int[] numeros = new int[array];
		numeros[0] = 10;
		numeros[1] = 20;
		numeros[2] = 30;
		numeros[3] = 40;
		numeros[4] = 50;
		// numeros[5] = 10;
		System.out.println("fora do for:" + numeros[0]);

		for (int contador = 0; contador < numeros.length; contador++) {
			System.out.println("dentro do for: " + numeros[contador]);
		}
		for (int numero : numeros) {
			System.out.println(numero);
		}

	}

}
