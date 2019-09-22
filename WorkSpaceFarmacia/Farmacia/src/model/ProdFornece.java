package model;

public class ProdFornece {
	
	private int codigoProduto;
	private int codigoFornecedor;
	
	public ProdFornece() {
		super();
	}

	public ProdFornece(int codigoProduto, int codigoFornecedor) {
		super();
		this.codigoProduto = codigoProduto;
		this.codigoFornecedor = codigoFornecedor;
	}

	public int getCodigoProduto() {
		return codigoProduto;
	}

	public void setCodigoProduto(int codigoProduto) {
		this.codigoProduto = codigoProduto;
	}

	public int getCodigoFornecedor() {
		return codigoFornecedor;
	}

	public void setCodigoFornecedor(int codigoFornecedor) {
		this.codigoFornecedor = codigoFornecedor;
	}
}