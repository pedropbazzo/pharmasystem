package model;

public class Fornecedor {
	
	private int codigoFornecedor;
	private String nome;
	private String cnpj;
	private String telefone;
	private String email;
	private Produto produto;
	
	public Fornecedor(){
		super();
	}

	public Fornecedor(int codigoFornecedor, String nome, String cnpj, String telefone, String email, Produto produto) {
		super();
		this.codigoFornecedor = codigoFornecedor;
		this.nome = nome;
		this.cnpj = cnpj;
		this.telefone = telefone;
		this.email = email;
		this.produto = produto;
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

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	@Override
	public String toString() {
		return "Fornecedor [codigoFornecedor=" + codigoFornecedor + ", nome=" + nome + ", cnpj=" + cnpj + ", telefone="
				+ telefone + ", email=" + email + ", produto=" + produto + "]";
	}
	
	public void mostrar(){
		
	}

}
