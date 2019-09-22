package model;

import java.util.Date;

public class PedidoFornecedor {
	
	private Date dataPedido;
	private double valor;
	private String status;
	private String previsaoEntrega;
	private Date dataEntrega;
	private int numeroPedido;
	private int quantidade;
	private String lote;
	
	public PedidoFornecedor(){
		super();
	}

	public PedidoFornecedor(Date dataPedido, double valor, String status, String previsaoEntrega, Date dataEntrega,
			int numeroPedido, int quantidade, String lote) {
		super();
		this.dataPedido = dataPedido;
		this.valor = valor;
		this.status = status;
		this.previsaoEntrega = previsaoEntrega;
		this.dataEntrega = dataEntrega;
		this.numeroPedido = numeroPedido;
		this.quantidade = quantidade;
		this.lote = lote;
	}

	public Date getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPrevisaoEntrega() {
		return previsaoEntrega;
	}

	public void setPrevisaoEntrega(String previsaoEntrega) {
		this.previsaoEntrega = previsaoEntrega;
	}

	public Date getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(Date dataEntrega) {
		this.dataEntrega = dataEntrega;
	}

	public int getNumeroPedido() {
		return numeroPedido;
	}

	public void setNumeroPedido(int numeroPedido) {
		this.numeroPedido = numeroPedido;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getLote() {
		return lote;
	}

	public void setLote(String lote) {
		this.lote = lote;
	}
	
	

}
