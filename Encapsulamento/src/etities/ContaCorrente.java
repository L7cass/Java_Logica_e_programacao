package etities;

public class ContaCorrente extends conta {
	
	@Override
	public void sacar (double saque) {
		saldo -= saque + 2.0;
	}

	

}
