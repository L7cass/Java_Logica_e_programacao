package Principal;

public class Fun��es {

	public static void main(String[] args) {
		/*
		 * funcoes representam um processamento ou processo; o que indentifica uma
		 * fun��o s�o os parenteses System.out.println()� um exemplo de
		 * fun��o/procedimento
		 */
			mostrarMensagem();
		/* String funcaoRecebida = */ MostrarMensagemComParametro(33);
		System.out.println(calcular());
		int recebaCalcular = calcular();
		System.out.println("Recebeu: " + recebaCalcular);
		
		System.out.println("resultado da soma: " + somar(10, 20));
		
		int x = 10 ;
		int y = 100;
		
		System.out.println("Nova soma: " + somar(x, y));
		
		int a = 50;
		int b = 50;
		System.out.println("Nova soma: " + somar(b, a));
		
	}

	static void mostrarMensagem() {
		System.out.println("Minha primeira fun��o");
	}

	static void MostrarMensagemComParametro(int idade) {
		System.out.println("Minha idade �: " + idade);
	}
	static int calcular () {
		int x = 10;
		int y = 5;
		return x + y;
	}
	static int somar(int x, int y) {
		return x = y ;


	}

}
