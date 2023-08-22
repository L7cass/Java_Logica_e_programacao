package Principal;

import etities.ContaCorrente;
import etities.ContaPoupanca;
import etities.conta;

public class ProgramConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		conta conta = new conta();
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();

		System.out.println("Conta Normal: ");
		conta.setTitular("Lucas");
		conta.setAgencia(123456);
		conta.setNumeroConta(5563);
		conta.depositar(150.25);
		conta.sacar(50.00);

		conta.obterDadosbancarios();

		System.out.println(" ");
		System.out.println(" ");

		System.out.println("Conta Corrente: ");

		cc.setTitular("Lucas");
		cc.setAgencia(123456);
		cc.setNumeroConta(5563);
		cc.depositar(590.25);
		cc.sacar(250.00);

		cc.obterDadosbancarios();

		System.out.println("  ");
		System.out.println(" ");

		System.out.println("Conta Poupança: ");

		cp.setTitular("Lucas");
		cp.setAgencia(123456);
		cp.setNumeroConta(5563);
		cp.depositar(1590.25);
		cp.sacar(1250.00);

		cp.obterDadosbancarios();

	}
}
