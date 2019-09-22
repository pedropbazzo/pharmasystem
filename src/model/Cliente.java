package model;

import java.util.Date;

public class Cliente {
	
	private int codigoCliente;
	private String nome;
	private String telefone;
	private String email;
	private String sexo;
	private String cpf;
	private String rg;
	private String situacao;
	private Date nascimento;
	private double valorPago;
	private double valorAPagar;
	private Endereco endereco;
	
	public Cliente(){
		super();
	}

	public Cliente(int codigoCliente, String nome, String telefone, String email, String sexo, String cpf, String rg,
			String situacao, Date nascimento, double valorPago, double valorAPagar, Endereco endereco) {
		super();
		this.codigoCliente = codigoCliente;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.sexo = sexo;
		this.cpf = cpf;
		this.rg = rg;
		this.situacao = situacao;
		this.nascimento = nascimento;
		this.valorPago = valorPago;
		this.valorAPagar = valorAPagar;
		this.endereco = endereco;
	}

	public int getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(int codigoCliente) {
		this.codigoCliente = codigoCliente;
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

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

	public double getValorPago() {
		return valorPago;
	}

	public void setValorPago(double valorPago) {
		this.valorPago = valorPago;
	}

	public double getValorAPagar() {
		return valorAPagar;
	}

	public void setValorAPagar(double valorAPagar) {
		this.valorAPagar = valorAPagar;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	

	@Override
	public String toString() {
		return "Cliente [codigoCliente=" + codigoCliente + ", nome=" + nome + ", telefone=" + telefone + ", email="
				+ email + ", sexo=" + sexo + ", cpf=" + cpf + ", rg=" + rg + ", situacao=" + situacao + ", nascimento="
				+ nascimento + ", valorPago=" + valorPago + ", valorAPagar=" + valorAPagar + ", endereco=" + endereco
				+ "]";
	}

	
	

}
