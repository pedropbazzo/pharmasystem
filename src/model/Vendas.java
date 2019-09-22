package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Vendas {
	
	private Cliente cliente;
	private Date data;
	private List<ItemDeVenda> itemDeVenda = new ArrayList<ItemDeVenda>();
	
	public Vendas() {
		super();
	}

	public Vendas(Cliente cliente, Date data) {
		super();
		this.cliente = cliente;
		this.data = data;
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
	
	public List<ItemDeVenda> getItemDeVenda() {
		return itemDeVenda;
	}
	
	public boolean inserirItem(ItemDeVenda item){
		return itemDeVenda.add(item);
	}
	
	public boolean removerItem(ItemDeVenda item){
		return itemDeVenda.remove(item);
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
				+ "\nNome\tQnt.\tSubtotal\n";
		for (ItemDeVenda item: itemDeVenda){
			nota += item.mostrar()+"\n";
		}
		
		nota += "**********";
		
		return nota;
	}

}
