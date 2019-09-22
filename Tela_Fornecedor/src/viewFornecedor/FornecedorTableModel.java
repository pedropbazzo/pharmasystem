package view.TM;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import model.Fornecedor;

public class FornecedorTableModel extends AbstractTableModel{
	private final List<Fornecedor> fornecedores;
	
	public FornecedorTableModel(List<Fornecedor> fornecedores) {
		super();
		this.fornecedores = fornecedores;
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return this.fornecedores.size();
	}

	@Override
	public Object getValueAt(int linha, int coluna) {
		// TODO Auto-generated method stub
		Fornecedor c = fornecedores.get(linha);
		
		switch (coluna) {
		case 0:
			return c.getId();
		case 1:
			return c.getNome();
		case 2:
			return c.getEmail();
		case 3:
			return c.getCnpj();
		case 4:
			return c.getTelefone();
		case 5:
			return c.getMensagem();
		default:
			return null;
			//break;
		}

	//	return null;
	}
	
	
	@Override
	public String getColumnName(int coluna){
		switch (coluna) {
		case 0:
			return "ID";
		case 1:
			return "Nome";
		case 2:
			return "E-mail";
		case 3:
			return "CNPJ";
		case 4:
			return "Telefone";
		case 5:
			return "Mensagem";
		default:
			return "";
		}
	}
	

}







