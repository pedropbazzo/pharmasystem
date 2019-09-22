package model;

public class Funcionario extends Usuario {
	
	private int matricula;
	private String nome;
	private String telefone;
	private String email;
	private String sexo;
	private String cpf;
	private String rg;
	private String nascimento;
	private double salario;
	
	public Funcionario() {
		super();
	}
	
	public Funcionario(String login, String senha, int tipo, String descricao, int matricula, String nome,
			String telefone, String email, String sexo, String cpf, String rg, String nascimento, double salario) {
		super(login, senha, tipo, descricao);
		this.matricula = matricula;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.sexo = sexo;
		this.cpf = cpf;
		this.rg = rg;
		this.nascimento = nascimento;
		this.salario = salario;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getNascimento() {
		return nascimento;
	}

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void mostrar(){
		System.out.println("Dados do funcionário:");
		System.out.println("Matrícula: "+this.getMatricula());
		System.out.println("Nome: "+this.getNome());
		System.out.println("Nascimento: "+this.getNascimento());
		System.out.println("Sexo: "+this.getSexo());
		System.out.println("CPF: "+this.getCpf());
		System.out.println("RG: "+this.getRg());
		System.out.println("E-mail: "+this.getEmail());
		System.out.println("Telefone: "+this.getTelefone());
		System.out.println("Salario fixo: "+this.getSalario());
	}
}