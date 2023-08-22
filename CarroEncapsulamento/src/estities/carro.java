package estities;

public class carro {
	public String modelo;
	public int ano;
	public String cor;
	public String motor;
	public String cambio;
	public int velocidadeMinima;
	public int velocidadeMaxima;

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public String getCambio() {
		return cambio;
	}

	public void setCambio(String cambio) {
		this.cambio = cambio;
	}
	
	public int getVelocidadeMinima() {
		return velocidadeMinima;
	}

	public void setVelocidadeMinima(int velocidadeMinima) {
		this.velocidadeMinima = velocidadeMinima;
	}

	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(int velcidade) {
		this.velocidadeMaxima = velcidade;
	}
	public void acelerarcarro(int acelerar) {
		 this.velocidadeMinima += acelerar++;
	
	}
	public void freio(int freio) {
		 this.velocidadeMaxima -= freio--;
	}

}
