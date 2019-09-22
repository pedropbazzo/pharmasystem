package model;

public class Pagamento {
	
	private String tipoPagamento;
	private String situacao;
	private double valor;
	
	
	public Pagamento() {
		super();
	}


	public Pagamento(String tipoPagamento, String situacao, double valor) {
		super();
		this.tipoPagamento = tipoPagamento;
		this.situacao = situacao;
		this.valor = valor;
	}


	public String getTipoPagamento() {
		return tipoPagamento;
	}


	public void setTipoPagamento(String tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}


	public String getSituacao() {
		return situacao;
	}


	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
}
