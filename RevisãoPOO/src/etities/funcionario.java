package etities;

public class funcionario extends pessoa {

	private double salario;
	private String empresa;
	
	public funcionario() {
		super();
		// TODO Auto-generated constructor stub
	}
	public funcionario(String nome, int idade, String cpf, char genero, double altura) {
		super(nome, idade, cpf, genero, altura);
		
	}
	public funcionario(double salario, String empresa) {
		super();
		this.salario = salario;
		this.empresa = empresa;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	
	/*@Override
	public void obterDadosPessoa() {
		// TODO Auto-generated method stub
		super.obterDadosPessoa();
	}*/
	
	@Override
	public Stirng toString() {
		
	}

	
}
