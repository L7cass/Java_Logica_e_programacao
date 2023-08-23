package Pricipal;

import etities.Cadastro;
import etities.chefia;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cadastro funcionario = new Cadastro();
		Cadastro gerente = new chefia();

		funcionario.setNome("Lucas");
		funcionario.setIdade(17);
		funcionario.setSalarioBruto(1500.00);

		funcionario.mostrarCadastro();

		gerente.setNome("Lucas");
		gerente.setIdade(17);
		gerente.setSalarioBruto(2500.00);

		gerente.mostrarCadastro();

	}

}
