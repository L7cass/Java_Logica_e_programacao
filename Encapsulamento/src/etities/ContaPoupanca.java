package etities;

public class ContaPoupanca extends conta{
	
	@Override
	public void sacar (double saque) {
		saldo -= saque + 2.75;
	}

}
