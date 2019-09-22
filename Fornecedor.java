package model;

public class Fornecedor {
	
	private int codigoFornecedor;
	private String nome;
	private String cnpj;
	private String telefone;
	private String email;
	private Endereco endereco;
	
	public Fornecedor(){
		super();
	}

	public Fornecedor(int codigoFornecedor, String nome, String cnpj, String telefone, String email, Endereco endereco) {
		super();
		this.codigoFornecedor = codigoFornecedor;
		this.nome = nome;
		this.cnpj = cnpj;
		this.telefone = telefone;
		this.email = email;
		this.endereco = endereco;
	}
	
	public Fornecedor(String nome, String cnpj, String telefone, String email, Endereco endereco) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
		this.telefone = telefone;
		this.email = email;
		this.endereco = endereco;
	}

	public Fornecedor(String nome, String cnpj, String telefone, String email) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
		this.telefone = telefone;
		this.email = email;
	}

	public int getCodigoFornecedor() {
		return codigoFornecedor;
	}

	public void setCodigoFornecedor(int codigoFornecedor) {
		this.codigoFornecedor = codigoFornecedor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
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
	
	public Endereco getEndereco() {
		return endereco;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public String mostrar() {
		return "Fornecedor [codigoFornecedor=" + codigoFornecedor + ", nome=" + nome + ", cnpj=" + cnpj + ", telefone="
				+ telefone + ", email=" + email + "]";
	}
	
}