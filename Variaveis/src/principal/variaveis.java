package principal;

public class variaveis {

	public static void main(String[] args) {

		int numero = 10;
		// numero = 10;
		double decimal = 10.50;

		int testeNumero = (int) 50.25;
		double testeNovoNumero = 10;

		// aspas duplas parar strings
		String nome = "Lucas";
		// aspas simples para char
		char sexo = 'M';
		// booleanos + valores verdadeiros ou falsos
		boolean verdadeiro = true;
		boolean falso = false;

		double peso = 65;
		int idade = 17;

		System.out.println(numero);
		System.out.println(decimal);
		System.out.println(testeNumero);
		System.out.println(testeNovoNumero);
		System.out.println(sexo);
		System.out.println(nome);
		System.out.println(verdadeiro);
		System.out.println(falso);
		System.out.print("nome:");
		System.out.println(" Lucas M");

		// para orgazizar o codigo usamos o
		// ctrl + shift + f
		System.out.println("*********************");
		System.out.print("meu nome �: " + nome);
		System.out.print(", peso " + peso + "Kg");
		System.out.print(", tenho " + idade + " Anos");
		System.out.print(", e sou do sexo " + sexo);

	}

}
