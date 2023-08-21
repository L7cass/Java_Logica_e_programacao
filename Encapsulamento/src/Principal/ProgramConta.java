package Principal;

public class ProgramConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		etities.conta conta = new Conta();
		
		conta.setTitular = "Lucas";
		
		
		conta.agencia = "3456-x";
		conta.NumeroConta = 6610;
		conta.Saldo = 30.00;
		
		conta.depositar (300.00);
		
		conta.obterDadosbancarios();
		
		conta.sacar(500.00);
		
		
	}

}
