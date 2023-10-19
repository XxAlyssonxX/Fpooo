package Funcionario;

public class Funcionario {
	private long id;
	private String nome;
	private String telefone;
	private int matricula;
	private String endereço;
	

	public Funcionario(long id, String nome, String telefone, int matricula, String endereço) {
		super();
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.matricula = matricula;
		this.endereço = endereço;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public double calculaSalario(double salarioHora, double horasTrabalhadas) {
		return 0;
	}
}
