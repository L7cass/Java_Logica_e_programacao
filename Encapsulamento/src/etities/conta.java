package etities;

public class conta {
	private String titular;
	private String agencia;
	private int NumeroConta;
	private double saldo;
	
	public String gettitular() {
		return titular;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	//atalho = alt + shift
	public void depositar(double valorDeposito) {
		saldo += valorDeposito;
	}public void sacar(double valorSacar) {
		saldo -= valorSacar;
	}
	
	public void obterDadosbancarios() {
		System.out.println("Titula: " + titular);
		System.out.println("Agencia: " + agencia);
		System.out.println("Conta" + NumeroConta);
		System.out.println("Saldo" + saldo);
		
		
	
	}

}
