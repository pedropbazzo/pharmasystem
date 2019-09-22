package model;

import java.util.Date;

public class ContasAPagar {
	
	private String descricao;
	private double valor;
	private Date data;
	
	public ContasAPagar(){
		super();
	}

	public ContasAPagar(String descricao, double valor, Date data) {
		super();
		this.descricao = descricao;
		this.valor = valor;
		this.data = data;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "ContasAPagar [descricao=" + descricao + ", valor=" + valor + ", data=" + data + "]";
	}
	
	public void mostrar(){
		
	}

}
