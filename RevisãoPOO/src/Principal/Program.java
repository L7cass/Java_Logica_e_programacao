package Principal;

import etities.funcionario;
import etities.pessoa;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		pessoa pessoa = new pessoa();
		funcionario func = new funcionario();

		System.out.println("Dados pessoais: ");
		pessoa.setNome("Lucas");
		pessoa.setAltura(1.75);
		pessoa.setCpf("123.456.789-10");
		pessoa.setGenero("Masculino");
		pessoa.setIdade(17);

		System.out.println(pessoa);

		System.out.println("Dados pessoais empresa: ");
		func.setNome("Lucas");
		func.setAltura(1.75);
		func.setCpf("123.456.789-10");
		func.setGenero("Masculino");
		func.setIdade(17);
		func.setSalario(17540.85);
		func.setEmpresa("Casa do Neymar");

		System.out.println(func);
		
		int[] numeros = new int (5);
		int cont = 10;
		for(int i = 0; i < 5; i++);{
			//entre com a sua altura
			numeros[i] = cont++;
		}
		
		for(int n : numeros) {
			System.out.println(n);
		}

	}

}
