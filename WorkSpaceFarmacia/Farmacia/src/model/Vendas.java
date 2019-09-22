package model;

import java.util.Date;

public class Vendas {
	
	private Cliente cliente;
	private Date data;
	private ItemDeVenda itemDeVenda;
	
	public Vendas() {
		super();
	}

	public Vendas(Cliente cliente, Date data, ItemDeVenda itemDeVenda) {
		super();
		this.cliente = cliente;
		this.data = data;
		this.itemDeVenda = itemDeVenda;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public ItemDeVenda getItemDeVenda() {
		return itemDeVenda;
	}

	public void setItemDeVenda(ItemDeVenda itemDeVenda) {
		this.itemDeVenda = itemDeVenda;
	}
	
	public String emitirNotaFiscal(){
		String nota = "************\n"
				+ "Nota fiscal"
				+ "\n*Nome da farmácia*"
				+ "\nCNPJ:*CNPJ da farmácia*"
				+ "\n**********"
				+ "\nData:" + getData()
				+ "\nCliente: " + cliente.getNome()
				+ "\n**********"
				+ "\nNome\tQnt.\tSubtotal"
				+ "\n"+itemDeVenda.mostrar();
		
		return nota;
	}
	
}