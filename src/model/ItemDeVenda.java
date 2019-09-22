package model;

import java.text.DecimalFormat;

public class ItemDeVenda {
	
	private int quantidade;
	private Produto produto;
	
	public ItemDeVenda(){
		super();
	}

	public ItemDeVenda(int quantidade, Produto produto) {
		super();
		this.quantidade = quantidade;
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public double calculaSubtotal(){
		double subtotal = produto.getValorVenda() * getQuantidade();
		DecimalFormat f = new DecimalFormat("#0.00");
		f.format(Double.valueOf(subtotal));
		return subtotal;
	}
	
	public String mostrar(){
		String mostra = produto.getNome()+"\t"+quantidade+"\t"+calculaSubtotal();
		return mostra;
	}
	
}
