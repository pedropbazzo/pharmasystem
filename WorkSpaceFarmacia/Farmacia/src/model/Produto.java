package model;

import java.util.Date;

public class Produto {
	
	private int codigo;
	private String nome;
	private double valorCusto;
	private double valorVenda;
	private String descricao;
	private Date dataFabricacao;
	private String marca;
	private String fornecedor;
	private int quantidade;
	private Date vencimento;
	
	public Produto(){
		super();
	}

	public Produto(int codigo, String nome, double valorCusto, double valorVenda, String descricao, Date dataFabricacao,
			String marca, String fornecedor, int quantidade, Date vencimento) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.valorCusto = valorCusto;
		this.valorVenda = valorVenda;
		this.descricao = descricao;
		this.dataFabricacao = dataFabricacao;
		this.marca = marca;
		this.fornecedor = fornecedor;
		this.quantidade = quantidade;
		this.vencimento = vencimento;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValorCusto() {
		return valorCusto;
	}

	public void setValorCusto(double valorCusto) {
		this.valorCusto = valorCusto;
	}

	public double getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(double valorVenda) {
		this.valorVenda = valorVenda;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(Date dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Date getVencimento() {
		return vencimento;
	}

	public void setVencimento(Date vencimento) {
		this.vencimento = vencimento;
	}
	
}