package Principal;

public class Vetor_Java {

	public static void main(String[] args) {
		// vetor e uma sequencia n�o odernada de dados do mesmo tipo
		// a contagem do vetor � por indice e inicia do indicie o
		// vetor n�o pode conter dados do tipos diferentes
		// vetor tbm e conhecido como Array
		// vetor � unidimensonal , uma dire��o
		// os dados do array s�o armazenados em um espa�o de memoria

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
